public class Employee {

	private String name;
	private int id = 1000;
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
		return "Employee '" + name + "' with the assigned ID-Number '" + id + "'";
	}
}

