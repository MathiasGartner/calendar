package at.gartner.calendar.data.viewmodel;

public class WeeklySummaryItem {
	private double totalHours;
	private String description;
	
	public double getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public WeeklySummaryItem()
	{
		
	}
	
	public WeeklySummaryItem(double totalHours, String description)
	{
		this.totalHours = totalHours;
		this.description = description;
	}
}
