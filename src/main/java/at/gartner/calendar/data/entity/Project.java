package at.gartner.calendar.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Project {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name = "userId")
	@JsonBackReference(value="u")
	private User user;

	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	@JsonManagedReference(value="p")
	private Set<Appointment> appointments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	protected Project()
	{
		
	}
	
	public Project(String name) {
		this.name = name;
	}	
	
	public Project(String name, User user) {
		this.name = name;
		this.user = user;
	}	
	
	public Long getUserId()
	{
		return this.user.getId();
	}
}
