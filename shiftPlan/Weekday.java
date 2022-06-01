package shiftPlan;

public class Weekday {
	private String day;
	
	public Weekday(String day, int dayId) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	
	@Override
	public String toString() {
		return "Weekday [day=" + day + "]";
	}
}
