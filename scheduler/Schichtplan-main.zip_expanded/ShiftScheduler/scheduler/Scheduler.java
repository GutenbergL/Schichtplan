package scheduler;

import java.util.ArrayList;

public class Scheduler {

	static ArrayList<Employee> allEmployees = new ArrayList<>();
	static ArrayList<Shift> shifts = new ArrayList<>();

	public static void addNewEmployee(String name) {
		allEmployees.add(new Employee(name));
	}

	public static void removeEmployee(Employee e) {
		allEmployees.remove(e);
		for (Shift s : shifts) {
			if (s.getShiftEmployees().contains(e)) {
				s.getShiftEmployees().remove(e);
			}
		}
	}

	public static void showCurrentEmployees() {
		System.out.println("+----+--------------------+");
		System.out.printf("|%-4s|%-20s|%n", "ID", "NAME");
		System.out.println("+----+--------------------+");
		for (Employee e : allEmployees) {
			System.out.println("|" + e + "|");
		}
		System.out.println("+----+--------------------+\n");
	}

	public static void searchEmployeesInShift(WorkingDay day, ShiftType type) {
		for (Shift s : shifts) {
			if (s.getDay() == day && s.getType() == type) {
				for (Employee e : s.getShiftEmployees()) {
					System.out.println(e.toString());
				}
			}
		}
	}
	
	public static void showEmployeeShifts(Employee e) {
		for(Shift s : shifts) {
			if(s.getShiftEmployees().contains(e)) {
				System.out.println(s);
			}
		}
	}
	
	public static void showEmptyShifts() {
		for(Shift s : shifts) {
			if(s.getShiftEmployees().isEmpty()) {
				System.out.println(s);
			}
		}
	}
	
	public static void showTimeTable() {
		
	}
}
