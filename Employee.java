import shiftPlan.Shift;

public class Employee {

	private String name;
	private int id;
	static int idUpp = 1000;
	Shift shifts;

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
		return "Employee: " + name + "\t|ID: " + id;
	}
}

