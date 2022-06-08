package scheduler;

public enum WorkingDay {
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday");
	public String name;

	
	WorkingDay(String name){
		this.name = name;
	}

	public static WorkingDay getTypeByOrdinal(int ordinal) {
        for(WorkingDay day : WorkingDay.values()) {
            if(day.ordinal() == ordinal) {
                return day;
            }
        }
        return null;
    }

}


	

