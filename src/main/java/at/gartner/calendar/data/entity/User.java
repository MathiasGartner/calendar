package at.gartner.calendar.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String username;
	private String password;
	private String surname;
	private String givenname;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference(value="u")
	private Set<Appointment> appointments;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference(value="p")
	private Set<Project> projects;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	protected User()
	{
		
	}
	
	public User(String username, String password, String surname, String givenname) {
		this.username = username;
		this.password = password;
		this.surname = surname;
		this.givenname = givenname;
	}	
}
