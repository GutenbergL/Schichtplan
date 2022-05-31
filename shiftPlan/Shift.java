package shiftPlan;




public class Shift {

	private String name;
	private String time;
	
	
	public Shift(String name, String time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public String getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return name + " " + time + "h";
	}

	
	
	
	
}
