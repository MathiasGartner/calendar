package at.gartner.calendar.data.viewmodel;

import java.time.ZonedDateTime;

public class SchedulerAppointment {
	private Long id;	
	private ZonedDateTime startDate;
	private ZonedDateTime endDate;
	private String subject;
	private String body;
	private Long projectId;
	private Long activityTypeId;
	
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

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getActivityTypeId() {
		return activityTypeId;
	}

	public void setActivityTypeId(Long activityTypeId) {
		this.activityTypeId = activityTypeId;
	}

	
	protected SchedulerAppointment()
	{
		
	}
	
	public SchedulerAppointment(ZonedDateTime startDate, ZonedDateTime endDate, String subject, String body, Long projectId, Long activityTypeId) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.subject = subject;
		this.body = body;
		this.projectId = projectId;
		this.activityTypeId = activityTypeId;
	}	
}
