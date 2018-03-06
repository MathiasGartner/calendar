package at.gartner.calendar.entity;

public class Appointment {
	public Appointment(String s, String b) {
		this.setSubject(s);
		this.setBody(b);
	}

	public String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public java.util.Date getDate() {
		return Date;
	}

	public void setDate(java.util.Date date) {
		Date = date;
	}

	public String Body;
	public java.util.Date Date;
}
