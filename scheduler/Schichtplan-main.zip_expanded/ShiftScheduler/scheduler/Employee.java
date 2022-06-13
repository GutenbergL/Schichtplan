package scheduler;

import java.io.Serializable;

public class Employee implements Serializable{

	private String name;
	private int id;
	private static int idCounter;

	public Employee(String name) {
		idCounter++;
		this.name = name;
		this.id = idCounter;
	}
	
	public static int getIdCounter() {
		return idCounter;
	}
	
	public static void setIdCounter(int idCounter) {
		Employee.idCounter = idCounter;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("%-4s|%-20s", id, name);
	}

}
