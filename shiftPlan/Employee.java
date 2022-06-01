package shiftPlan;

public class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public boolean isInShift() {
		return true;
	}

	@Override
	public String toString() {
		return String.format("%-6s | %-32s %n", "ID", name);
	}

}
