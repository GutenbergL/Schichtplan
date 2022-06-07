package scheduler;

public enum WorkingDay {
	MONDAY("Monday", 0),
	TUESDAY("Tuesday", 1),
	WEDNESDAY("Wednesday", 2),
	THURSDAY("Thursday", 3),
	FRIDAY("Friday", 4);
	public String name;
	public int index;
	
	WorkingDay(String name, int index){
		this.name = name;
		this.index = index;
	}
}
