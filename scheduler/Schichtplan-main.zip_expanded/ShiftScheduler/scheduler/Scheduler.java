package scheduler;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Scheduler {

	private static HashMap<Integer, Employee> allEmployees = new HashMap<>();
	private static ArrayList<Shift> shifts = new ArrayList<>();


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


	public static void removeEmployee(int id) throws IllegalArgumentException {
		if (!allEmployees.containsKey(id)) {
			throw new IllegalArgumentException("This Employee does not exist");
		}
		System.out.println(allEmployees.get(id).toString() + "has been removed");
		allEmployees.remove(id);
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
		for (Shift s : shifts) {
			if (s.getDay() == day && s.getType() == type) {
				for (Employee e : s.getShiftEmployees()) {
					System.out.println(e);
				}
			}
		}
	}

	public static void showEmployeeShifts(int id) throws IllegalArgumentException {
		if (!allEmployees.containsKey(id)) {
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
		for (Shift s : shifts) {
			System.out.println("+---------------+-------------------------+");
			System.out.println("|%15s|%-25s|".formatted("", s.getDay().name));
			System.out.println("|%-15s|%-25s|".formatted(s.getType().name, s.getType().time));
			for (Employee e : s.getShiftEmployees()) {
				System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
			}

		}
		System.out.println("+---------------+-------------------------+");
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
	public static void printTimeTableToFile(){
		File print = new File("Timetable.txt");
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(print))){
			for(Shift s : shifts){
			writer.write("+---------------+-------------------------+");
			writer.write(System.lineSeparator());
			writer.write("|%-15s|%-25s|".formatted("", s.getDay().name));
			writer.write(System.lineSeparator());
			writer.write("|%-15s|%-25s|".formatted(s.getType().name, s.getType().time));
			writer.write(System.lineSeparator());
			for(Employee e : s.getShiftEmployees()){
				writer.write("|%-15s|%-23s|".formatted("", e.toString()));
				writer.write(System.lineSeparator());
			}
		}
			writer.write("+---------------+-------------------------+");
		System.out.println("File printed!");
		}catch(IOException ioE){
			System.err.println("Can not write to file");
		}
	
	}
	public static void serialize() {
		
		try (ObjectOutputStream writeObjectStream = new ObjectOutputStream(new FileOutputStream("scheduler.ser"));){
			writeObjectStream.writeInt(Employee.getIdCounter());
			writeObjectStream.writeObject(Scheduler.allEmployees);
			writeObjectStream.writeObject(shifts);
		} catch(IOException ioE){
			System.out.println("A problem occurred");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void deserialize() {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("scheduler.ser"));){
			Employee.setIdCounter(in.readInt());
			allEmployees = (HashMap<Integer,Employee>) in.readObject();
			shifts = (ArrayList<Shift>) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
		
	