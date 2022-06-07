package scheduler;

public class Table {
	
	
	public void showEmployeesInShift() {
		Application table = new Application();

		// MONDAY
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%15s|%-4s|%-20s|".formatted("", "ID", "Name"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%15s|%-25s|".formatted("", "Monday"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
		for (Employee e : table.getEarlyMo()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
		for (Employee e : table.getLateMo()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
		for (Employee e : table.getNightMo()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		// TUESDAY
		System.out.println("|%15s|%-25s|".formatted("", "Tuesday"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
		for (Employee e : table.getEarlyTu()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
		for (Employee e : table.getLateTu()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
		for (Employee e : table.getNightTu()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		// WEDNESDAY
		System.out.println("|%15s|%-25s|".formatted("", "Wednesday"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
		for (Employee e : table.getEarlyWe()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
		for (Employee e : table.getLateWe()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
		for (Employee e : table.getNightWe()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		// THURSDAY
		System.out.println("|%15s|%-25s|".formatted("", "Thursday"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
		for (Employee e : table.getEarlyTh()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
		for (Employee e : table.getLateTh()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
		for (Employee e : table.getNightTh()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		// FRIDAY
		System.out.println("|%15s|%-25s|".formatted("", "Friday"));
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
		for (Employee e : table.getEarlyFr()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
		for (Employee e : table.getLateFr()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");
		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
		for (Employee e : table.getNightFr()) {
			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
		}
		System.out.println("+---------------+-------------------------+");

	}
}
