package scheduler;

public enum ShiftType {
	
	EARLY("Early Shift", "05:00 - 13:00"),
	LATE("Late Shift", "13:00 - 21:00"),
	NIGHT("Night Shift", "21:00 - 05:00");
	public String name;
	public String time;
	
	ShiftType(String name,String time){
		this.name = name;
		this.time = time;
	}
	
	public static ShiftType getTypeByOrdinal(int ordinal) {
        for(ShiftType type : ShiftType.values()) {
            if(type.ordinal() == ordinal) {
                return type;
            }
        }
        return null;
    }
}
