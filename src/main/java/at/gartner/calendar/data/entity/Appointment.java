package at.gartner.calendar.data.entity;

import java.time.Duration;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Appointment {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private ZonedDateTime startDate;
	private ZonedDateTime endDate;
	private String subject;
	private String body;

	@ManyToOne
    @JoinColumn(name = "projectId")
	@JsonBackReference(value="p")
	private Project project;

	@ManyToOne
    @JoinColumn(name = "activityTypeId")
	@JsonBackReference(value="a")
	private ActivityType activityType;

	public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }    
    
	public ZonedDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(ZonedDateTime startDate) {
		this.startDate = startDate;
	}

	public ZonedDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(ZonedDateTime endDate) {
		this.endDate = endDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}
	
	protected Appointment()
	{
		
	}

	public Appointment(ZonedDateTime startDate, ZonedDateTime endDate, String subject, String body) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.subject = subject;
		this.body = body;
	}

	public Appointment(ZonedDateTime startDate, ZonedDateTime endDate, String subject, String body, Project project, ActivityType activityType) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.subject = subject;
		this.body = body;
		this.project = project;
		this.activityType = activityType;
	}
	
	public Long getProjectId()
	{
		return this.project.getId();
	}

	public void setProjectId(Long id) {
	}
	
	public Long getActivityTypeId()
	{
		return this.activityType.getId();
	}
	
	public double getHours()
	{
		Duration d = Duration.between(this.getEndDate(), this.getStartDate());
		return -(d.toHours() + (d.toMinutes() % 60) / 60.0);
	}
}
