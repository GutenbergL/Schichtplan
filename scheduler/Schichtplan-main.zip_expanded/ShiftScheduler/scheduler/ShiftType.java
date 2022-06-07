package scheduler;

public enum ShiftType {
	
	EARLY("Early Shift", 0, "05:00 - 13:00"),
	LATE("Late Shift", 1, "13:00 - 21:00"),
	NIGHT("Night Shift", 2, "21:00 - 05:00");
	public String name;
	public int index;
	public String time;
	
	ShiftType(String name, int index, String time){
		this.name = name;
		this.index = index;
		this.time = time;
	}
}
