import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import shiftPlan.EarlyShift;
import shiftPlan.Shift;

public class UserInterface {

	public void userInterface() {
		System.out.println("Press 1 to start");
		int breakP = 1;
		ArrayList<Employee> employees = new ArrayList<>();
		Iterator<Employee> itr = employees.iterator();
		ArrayList<Shift> shifts = new ArrayList<>();
		HashMap <Integer, String> search = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		char userInput = sc.next().charAt(0);
		do {
			if (userInput == '1') {
				// Nur zum testen der Funktion, werden sp�ter sysout mit storagedrive ersetzen
				System.out.println("What do you want to do?\n");
				System.out.println("Manage Shifts\t\t|1\nManage Employees\t|2\n");
				char userInput2 = sc.next().charAt(0);

				// Rohbau CMD bedienelemente
				if (userInput2 == '1') {
					
					System.out.println(
							"Insert employee in a shift\t\t|1\nRelocate employee to different shift\t|2\nRemove employee from shift\t\t|3\nShow employees in current shifts\t|4\n");
					int userInput3 = sc.nextInt();
					if (userInput3 == 1) {
						System.out.println("Employees available are: ");
						for (Employee e : employees) {
							System.out.println(e.toString());
						}
						System.out.println("Enter the ID of the employee u want to add to a shift: ");
						int id = sc.nextInt();
						for (Employee e : employees) {
							if(e.getId() == id) {
								e.shifts = new EarlyShift();
								
							}
						}

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
						int id = sc.nextInt();
//					for (Employee e : employees) {
//						System.out.println(e.toString());
//					}
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
						System.out.println("Type the first name of the employee you want to add:");
						String fname = sc.next();
						System.out.println("Type the last name in: ");
						String lname = sc.next();
						String fullName = fname + " " + lname;
						employees.add(new Employee(fullName));
						for (Employee e : employees) {
							if (e.getName() == fullName) {
//								search.put(employees.get(e.getId()), employees.(e.getName()));
								System.out.println(e.toString() + " has been added to employees\n");
							}
						}
						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}
					} else if (userInput3 == 2) {
						System.out.println("Type the first name of the employee you want to remove");
						char id = sc.next().charAt(1);
//						System.out.println("now type the last name in");
//						String lname = sc.next();
//						String fullName = fname + " " + lname;
						for (Employee e : employees) {
							if (e.getId() == id) {
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
						for (Employee e : employees) {
							System.out.println(e);
						}
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

//	public void employeeMenu() {
//		int breakP = 1;
//		ArrayList<Employee> employees = new ArrayList<>();
//		Iterator<Employee> itr = employees.iterator();
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("1. Add new Employee");
//			System.out.println("2. Remove Employee");
//			System.out.println("3. Show current Employees");
//
//			int userInput = sc.nextInt();
//
//			if (userInput == 1) {
//				System.out.println("Type the first name of the employee you want to add:");
//				String fname = sc.next();
//				System.out.println("Type the last name in: ");
//				String lname = sc.next();
//				String fullName = fname + " " + lname;
//				employees.add(new Employee(fullName));
//				for (Employee e : employees) {
//					if (e.getName() == fullName) {
//						System.out.println(e.toString() + " has been added to Employees\n");
//					}
//				}
//				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//						+ "Zum verlassen des Programms f druecken");
//				char userInputToOutput = sc.next().charAt(0);
//				if (userInputToOutput == 'f') {
//					breakP++;
//				}
//			} else if (userInput == 2) {
//				System.out.println("Type the first name of the employee you want to delete");
//				String fname = sc.next();
//				System.out.println("now type the last name in");
//				String lname = sc.next();
//				String fullName = fname + " " + lname;
//				for (Employee e : employees) {
//					if (e.getName().equals(fullName)) {
//						itr.remove();
//						System.out.println(e.toString() + " has been removed\n");
//					}
//				}
//				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//						+ "Zum verlassen des Programms f druecken");
//				char userInputToOutput = sc.next().charAt(0);
//				if (userInputToOutput == 'f') {
//					breakP++;
//				}
//			} else if (userInput == 3) {
//				for (Employee e : employees) {
//					System.out.println(e);
//				}
//				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//						+ "Zum verlassen des Programms f druecken");
//				char userInputToOutput = sc.next().charAt(0);
//				if (userInputToOutput == 'f') {
//					breakP++;
//				}
//			}
//		} while (breakP <= 1);
//		System.out.println("Wir w�nschen ihnen einen guten Tag");
//		sc.close();
//	}
}
