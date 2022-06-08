package scheduler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Shift implements Serializable{
	
	private ShiftType type;
	private WorkingDay day;
	private ArrayList<Employee> shiftEmployees;
	
	public Shift(ShiftType type, WorkingDay day)  {
		this.type = type;
		this.day = day;
		//Emma fragen ist grund für verdoppelungsbug
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
	
	public void removeEmployeeFromShift(Employee employee) {
		shiftEmployees.remove(employee);
		}
	

	public void addEmployeeToShift(Employee employee) throws IllegalArgumentException {
		if(!Scheduler.allEmployees.containsValue(employee)) {
			throw new IllegalArgumentException("This Employee does not exist");
		}
		shiftEmployees.add(employee);		
	}
	
	@Override
	public String toString() {
		return String.format("%-12s|%-10s|%-15s", type.name, day.name, type.time);
	}
}
