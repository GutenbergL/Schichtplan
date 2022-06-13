package scheduler;

import java.util.Scanner;

public class Application {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scheduler.initializeShifts();
		Scheduler.deserialize();
		startProgram();

	}

		public static void shiftMenu() {
		System.out.println(String.format("%-5s| Insert employee in a shift", "1"));
		System.out.println(String.format("%-5s| Remove employee from shift", "2"));
		System.out.println(String.format("%-5s| Show employees in current shifts", "3"));
		System.out.println(String.format("%-5s| Print Timetable to File", "4"));
		System.out.println(String.format("%-5s| Back to Main menu", "5"));
		int shiftMenu = sc.nextInt();
		while (shiftMenu < 1 || shiftMenu > 5) {
			System.out.println("Please enter number between 1 and 5:");
			shiftMenu = sc.nextInt();
		}

		switch (shiftMenu) {
		case 1:
			addEmployeeInShift();
			break;
		case 2:
			System.out.println("Enter the ID of the Employee you want to remove from shifts:");
			int id = sc.nextInt();
			Scheduler.deleteEmployeeFromShift(id);
			break;
		case 3:
			Scheduler.showTimeTable();
			break;
		case 4:
			Scheduler.printTimeTableToFile();
			break;
		case 5:
			break;
		default:
			System.err.println("Invalid Entry");
			break;
		}
	}
	

	public static void employeeMenu() {
		System.out.println(String.format("%-5s| Add new employee", "1"));
		System.out.println(String.format("%-5s| Remove employee", "2"));
		System.out.println(String.format("%-5s| Show current employees", "3"));
		System.out.println(String.format("%-5s| Back to Main menu", "5"));
		int employeeMenu = sc.nextInt();
		switch (employeeMenu) {
		case 1:
			System.out.println("Enter the first name of the Employee");
			String fname = sc.next();
			System.out.println("Now enter the last name");
			String lname = sc.next();
			String name = fname + " " + lname;
			Scheduler.addNewEmployee(name);
			break;
		case 2:
			System.out.println("Enter the ID of the Employee you want to remove: ");
			int id = sc.nextInt();
			Scheduler.removeEmployee(id);

			break;
		case 3:
			Scheduler.showCurrentEmployees();
			break;
		case 5:
			break;
		default:
			System.err.println("Invalid Entry");
			break;
		}
	}
	

	public static void searchMenu() {
		System.out.println("What are you looking for?");
		System.out.println(String.format("%-5s| Search for empty Shift", "1"));
		System.out.println(String.format("%-5s| Search employees in a shift", "2"));
		System.out.println(String.format("%-5s| Search for employee by ID", "3"));
		System.out.println(String.format("%-5s| Back to Main Menu", "5"));
		int searchMenu = sc.nextInt();
		switch (searchMenu) {
		case 1:
			Scheduler.showEmptyShifts();
			break;
		case 2:
			searchEmployeesInShift();
			break;
		case 3:
			System.out.println("Please enter Employee ID:");
			int id = sc.nextInt();
			Scheduler.showEmployeeShifts(id);
			break;
		case 5:
			break;
		default:
			System.err.println("Invalid Entry");
			break;
		}
	}
	

	public static void searchEmployeesInShift() {
		System.out.println("Please enter a day:");
		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
		int day = sc.nextInt();
		while (day < 0 || day > 4) {
			System.out.println("Please enter number between 0 and 4:");
			day = sc.nextInt();
		}
		System.out.println("Please enter a shift:");
		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
		int type = sc.nextInt();
		while (type < 0 || type > 2) {
			System.out.println("Please enter number between 0 and 2:");
			type = sc.nextInt();
		}
		Scheduler.printEmployeesInShift(WorkingDay.getTypeByOrdinal(day), ShiftType.getTypeByOrdinal(type));
	}

	
	public static void addEmployeeInShift() {
		System.out.println("Enter the ID of the Employee you want to add:");
		int id = sc.nextInt();
		System.out.println("Please enter a day:");
		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
		int day = sc.nextInt();
		while (day < 0 || day > 4) {
			System.out.println("Please enter number between 0 and 4:");
			day = sc.nextInt();
		}
		System.out.println("Please enter a shift:");
		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
		int type = sc.nextInt();
		while (type < 0 || type > 2) {
			System.out.println("Please enter number between 0 and 2:");
			type = sc.nextInt();
		}
		Scheduler.insertEmployeeInShift(id, WorkingDay.getTypeByOrdinal(day), ShiftType.getTypeByOrdinal(type));
	}

	/*
	 * Startprogramm startet das gesamte Programm
	 */
	public static void startProgram() {
		int breakP = 1;
		System.out.println("Press 1 to start");
		char startProgramm = sc.next().charAt(0);

		do {
			if (startProgramm == '1') {
				System.out.println("What do you want to do?");
				System.out
						.println("%-5s| Manage Shifts%n%-5s| Manage Employees%n%-5s| Searchfunction%n%-5s| Stop Program"
								.formatted("1", "2", "3", "f"));
				char inputMainMenu = sc.next().charAt(0);
				switch (inputMainMenu) {
				case '1':
					shiftMenu();
					break;
				case '2':
					employeeMenu();
					break;
				case '3':
					searchMenu();
					break;
				case 'f':
					breakP++;
					break;
				default:
					System.err.println("Invalid Entry");
					break;
				}
			}

		} while (breakP <= 1);
		Scheduler.serialize();
		System.out.println("Have a great Day!");
		sc.close();
	}

}