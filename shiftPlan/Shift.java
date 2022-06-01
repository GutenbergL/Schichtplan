package shiftPlan;

import java.util.ArrayList;

public class Shift {

	private String name;
	private String time;
	Weekday weekday;
	Employee employee;
	
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
	
	public Weekday getWeekday() {
		return weekday;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public ArrayList<Shift> earlyShift(){
		return new ArrayList<Shift>() ;
	}
	public boolean isInShift() {
//		for(ArrayList<Shift> g : shifts) {
//			for(Shift j : earlyShift) {
//				if(!earlyShift.contains(employees.get(j.getEmployee().))) {
//					System.out.println());
//				}
//			}
//			for(Shift m : lateShift) {
//				
//			}
//			for(Shift n : nightShift) {
//				
//			}
//			
//		}
		return true;
	}


	@Override
	public String toString() {
		return name + " " + time + "h";
	}

	
	
	
	
}
