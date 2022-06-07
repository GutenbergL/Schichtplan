package scheduler;

import java.util.ArrayList;

public class Shift {
	
	private ShiftType type;
	private WorkingDay day;
	//Static ?
	private static ArrayList<Employee> shiftEmployees;
	
	public Shift(ShiftType type, WorkingDay day) {
		this.type = type;
		this.day = day;
		shiftEmployees = new ArrayList<>();
	}

	
	public ShiftType getType() {
		return type;
	}

	public WorkingDay getDay() {
		return day;
	}


	public ArrayList<Employee> getShiftEmployees() {
		return shiftEmployees;
	}
	
	public static void removeEmployeeFromShift(Employee employee) {
		shiftEmployees.remove(employee);
		}
	
	//Static ? Emma fragen
	public static void addEmployeeToShift(Employee employee) {
		if(!Scheduler.allEmployees.contains(employee)) {
			//throw new IllegalArgumentException("");
		}
		shiftEmployees.add(employee);
	}
	
	@Override
	public String toString() {
		return String.format("%-15s|%-20s|%-20s", type.name, day.name, type.time);
	}
}
