package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import shiftPlan.Employee;

public class Scheduler {

	private ArrayList<Employee> employees = new ArrayList<>();
	
	ArrayList<ArrayList<Employee>> employeesInShifts = new ArrayList<>(Arrays.asList(earlyShift(), lateShift(), nightShift()));
	
	public ArrayList<Employee> earlyShift(){
		return new ArrayList<>();
	}
	public ArrayList<Employee> lateShift(){
		return new ArrayList<>();
	}
	public ArrayList<Employee> nightShift(){
		return new ArrayList<>();
	}
	public void mainProgramm() {
		int breakP = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start");
		char startProgramm = sc.next().charAt(0);

		do {
			if (startProgramm == '1') {
				System.out.println("What do you want to do?\n");
				System.out.println("Manage Shifts\t\t|1\nManage Employees\t|2\n");
				char inputMainMenu = sc.next().charAt(0);
				switch (inputMainMenu) {
				case '1':
					System.out.println("Insert employee in a shift\t\t|1\nRemove employee from shift\t\t|2\nShow employees in current shifts\t|3\n");
					int shiftMenu = sc.nextInt();
					switch (shiftMenu) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					}
					break;
				case '2':
					System.out.println("Add new employee\t|1\nRemove employee\t\t|2\nShow current employees\t|3");
					int employeeMenu = sc.nextInt();
					switch (employeeMenu) {
					case 1:
						addNewEmployee();
						break;
					case 2:
						removeEmployee();
						break;
					case 3:
						showCurrentEmployees();
						break;
					}
					break;

				default:
				}
			} else {
				System.out.println("Have a good day!");
				breakP++;
			}
		} while (breakP <= 1);
		sc.close();
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public ArrayList<ArrayList<Employee>> getEmployeesInShifts() {
		return employeesInShifts;
	}

	public void loop() {
		System.out.println("Press 1 to start");
		int breakP = 1;

		ArrayList<Employee> employees = new ArrayList<>();

//		Habe probiert eine Mehrdimensionalen Array zu machen das die Mitarbeiter Objekte in unterschiedliche
//		Schichten einteilt
//		ArrayList<ArrayList<Shift>> shifts = new ArrayList<>();
//		ArrayList <Shift> earlyShift = new ArrayList<>();
//		ArrayList <Shift> lateShift = new ArrayList<>();
//		ArrayList <Shift> nightShift = new ArrayList<>();
//		shifts.add(earlyShift);
//		shifts.add(lateShift);
//		shifts.add(nightShift);

//		Die ArrayList befüllt mit paar Beispiel Objekten
		Employee e1 = new Employee("Sandra Bullock");
		Employee e2 = new Employee("Thomas Jeffrey");
		Employee e3 = new Employee("Will Sanders");
		Employee e4 = new Employee("Schmidt Friedrich");
		Employee e5 = new Employee("Peter Eernst");
		Employee e6 = new Employee("Dieter Winfried");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

//		Zur suche bestimmter Werte, kommt später mit einer Suchfunktion im dem MainMenu
//		HashMap <Character, ArrayList<Employee>> shiftToEmployee = new HashMap<>();
//		HashMap <Integer, String> idToName = new HashMap<>();
//		HashMap <Character, String> dateToId = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		char userInput = sc.next().charAt(0);
		do {
			if (userInput == '1') {
				System.out.println("What do you want to do?\n");
				System.out.println("Manage Shifts\t\t|1\nManage Employees\t|2\n");
				char userInput2 = sc.next().charAt(0);

				// Bedienelemente
				if (userInput2 == '1') {
					System.out.println(
							"Insert employee in a shift\t\t|1\nRemove employee from shift\t\t|2\nShow employees in current shifts\t|3\n");
					int userInput3 = sc.nextInt();

					if (userInput3 == 1) {
						System.out.println("Employees available are: ");

//						Noch in bearbeitung.
//							if (e.isInShift()){
//							}
//						System.out.println("Enter the ID of the employee u want to add to a shift: ");
//						int id = sc.nextInt();
//						
//						System.out.println("In which shift do you want to add the employee ");
//						for (Shift e : shifts) {
//						System.out.println(e.getName());
//						}
//						int idNext = sc.nextInt();
//						for (Shift e : shifts){
//							if(e.getEmployee().getId() == idNext ) {
//								
//							}
//						}

						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}

					} else if (userInput3 == 2) {
						System.out.println("Employees that are in a shift:\n");
						System.out.println("Early Shift \t\t|Late Shift \t\t|Night Schift ");
						System.out.println("Employee \t|ID\t|\n");
						System.out.println("Enter the ID of employee you want to relocate:");
//						int id = sc.nextInt();

						System.out.print("Enter anything to return to main menu or press 'f' to exit the programm");
						char userInputToOutput2 = sc.next().charAt(0);
						if (userInputToOutput2 == 'f') {
							breakP++;
						}
					} else if (userInput3 == 3) {
						System.out.println("Eintrag wurde erstellt");
						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");

						char userInputToOutput3 = sc.next().charAt(0);
						if (userInputToOutput3 == 'f') {
							breakP++;
						}
					}
				} else if (userInput2 == '2') {
					System.out.println("Add new employee\t|1");
					System.out.println("Remove employee\t\t|2");
					System.out.println("Show current employees\t|3");

					int userInput3 = sc.nextInt();

					if (userInput3 == 1) {
						// Du kannst das ignorieren war um zu schauen wie man einem Key einer HashMap
						// mehrere Objekte zuweisen kann
//						int sortId;
//						for (int i = 0; i < employees.size(); i++) {
//							sortId = employees.get(i).getId();
//							ArrayList <Employee> objectList = search.get(sortId);
//							if (objectList == null) {
//								objectList = new ArrayList<>();
//							}if (employees.get(i).getName() == fullName) {
//								objectList.add(employees.get(i));
//								search.put(fullName, objectList);
//								search.put(employees.get(e.getId()), employees.get(e.getName()));

						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}
					} else if (userInput3 == 2) {
						System.out.println("Enter the ID of the employee you want to remove");
						int id = sc.nextInt();
						for (Iterator<Employee> itr = employees.iterator(); itr.hasNext();) {
							Employee e = itr.next();
//					            if (e.getId() == id)
							{
								itr.remove();
								System.out.println(e.toString() + " has been removed\n");
							}
						}
						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}
					} else if (userInput3 == 3) {
						System.out.println("----------------------------------------");
						System.out.printf("%-6s | %-32s %n", "ID", "NAME");
						System.out.println("----------------------------------------");
						for (Employee e : employees) {
							System.out.println(e);
						}
						System.out.println("----------------------------------------\n");
						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}
					}
				} else {
					System.err.println("Invalid Entry");
				}

			}

		} while (breakP <= 1);
		System.out.println("We wish you a good day!");
		sc.close();
	}
	
	
	public void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the first name of the employee you want to add:");
		String fname = sc.next();
		System.out.println("Type the last name in: ");
		String lname = sc.next();
		String fullName = fname + " " + lname;
		employees.add(new Employee(fullName));
		for (Employee e : employees) {
			if (e.getName() == fullName) {
				System.out.println(e.toString() + " has been added to employees\n");
			}

		}
		sc.close();
	}
	
	public void removeEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the employee you want to remove");
		int id = sc.nextInt();
		for (Iterator<Employee> itr = employees.iterator(); itr.hasNext();) {
			Employee e = itr.next();
//	            if (employees.indexOf(emp object) == id)
			{
				itr.remove();
				System.out.println(e.toString() + " has been removed\n");
			}
		}
		sc.close();
	}
	
	public void showCurrentEmployees() {
		System.out.println("----------------------------------------");
		System.out.printf("%-6s | %-32s %n", "ID", "NAME");
		System.out.println("----------------------------------------");
		for (Employee e : employees) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------\n");
	}
}
