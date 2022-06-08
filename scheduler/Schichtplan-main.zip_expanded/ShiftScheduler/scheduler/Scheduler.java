package scheduler;

import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.HashMap;

public class Scheduler {

//	static ArrayList<Employee> allEmployees = new ArrayList<>();
	static HashMap<Integer, Employee> allEmployees = new HashMap<>();
	static ArrayList<Shift> shifts = new ArrayList<>();

	public static void initializeShifts() {
		for (WorkingDay day : WorkingDay.values()) {
			for (ShiftType type : ShiftType.values()) {
				shifts.add(new Shift(type, day));
			}
		}
	}

	public static void addNewEmployee(String name) {
		Employee e = new Employee(name);
		allEmployees.put(e.getId(), e);
		System.out.println(e + "has been added");
	}
	
//	public static void addNewEmployee(Employee employee) {
//		empId.put(employee.getId(), employee);
//			allEmployees.add(new Employee(name));
//	}

	public static void removeEmployee(int id) throws IllegalArgumentException{
		if(!allEmployees.containsKey(id)) {
			throw new IllegalArgumentException("This Employee does not exist");
		}
		System.out.println(allEmployees.get(id).toString() + "has been removed");
		allEmployees.remove(id);
		//Methode zum speichern der Datei, nachdem ein Nutzer aus dem Programm gelöscht wurde
		try{
			Application.serialize();
		}catch(NotSerializableException nsE){
			System.err.println("File can not be safed!");
		}
		/*_____________________________________________________________________________________
		*/
		
//		for (Shift s : shifts) {
//			if (s.getShiftEmployees().contains(e)) {
//				s.getShiftEmployees().remove(e);
//			}
//		}
	}

	public static void showCurrentEmployees() {
		System.out.println("+----+--------------------+");
		System.out.printf("|%-4s|%-20s|%n", "ID", "NAME");
		System.out.println("+----+--------------------+");
		for (Employee e : allEmployees.values()) {
			System.out.println("|" + e + "|");
		}
		System.out.println("+----+--------------------+\n");
	}


	public static void printEmployeesInShift(WorkingDay day, ShiftType type) {
//		if() {
//			throw new IllegalArgumentException("Invalid entry");
//		}
		for (Shift s : shifts) {
			if (s.getDay() == day && s.getType() == type) {
				for (Employee e : s.getShiftEmployees()) {
					System.out.println(e);
				}
			}
		}
	}

	public static void showEmployeeShifts(int id) {
		if(!allEmployees.containsKey(id)) {
			throw new IllegalArgumentException("This Employee does not exist");
		}
		Employee e = allEmployees.get(id);
		System.out.println(e + "works in:");
		for (Shift s : shifts) {
			if (s.getShiftEmployees().contains(e)) {
				System.out.println(s);
			}
		}
	}

	public static void showEmptyShifts() {
		System.out.println("These shifts are empty:");
		System.out.println("+------------+----------+---------------+");
		for (Shift s : shifts) {
			if (s.getShiftEmployees().isEmpty()) {
				System.out.println("|" + s + "|");
				System.out.println("+------------+----------+---------------+");
			}
		}
	}

	public static void showTimeTable() {
	}

	public static void insertEmployeeInShift(int id, WorkingDay day, ShiftType type) {
		Employee e = allEmployees.get(id);
		for (Shift s : shifts) {
			if (s.getDay().equals(day) && s.getType().equals(type)) {
					if (!s.getShiftEmployees().contains(e)) {
						s.addEmployeeToShift(e);
						System.out.println(e + "has been added to " + s);
				}
			}
		}
	}

	public static void deleteEmployeeFromShift(int id) {
		for (Shift s : shifts) {
			s.removeEmployeeFromShift(allEmployees.get(id));
		}
	}

//	public static Employee getByID(int id) {
//		Employee e = null;
//		for (Employee emp : allEmployees) {
//			if (id == emp.getId()) {
//				e = emp;
//			}
//		}
//		return e;
//	}
}
