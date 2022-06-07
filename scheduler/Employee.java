package scheduler;

public class Employee {

	private String name;
	private int id;
	static int idUpp;
	
	public Employee(String name) {
		idUpp++;
		this.name = name;
		this.id = idUpp;
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
