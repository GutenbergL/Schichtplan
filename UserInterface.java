package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import shiftPlan.EarlyShift;
import shiftPlan.Employee;
import shiftPlan.LateShift;
import shiftPlan.NightShift;
import shiftPlan.Shift;

public class UserInterface {

	public void userInterface() {
		System.out.println("Press 1 to start");
		int breakP = 1;
		
		ArrayList<Employee> employees = new ArrayList<>();
//		Shift [][] used = new Shift[4][2];
		
		
		ArrayList<ArrayList<Shift>> shifts = new ArrayList<>();
		ArrayList <Shift> earlyShift = new ArrayList<>();
		ArrayList <Shift> lateShift = new ArrayList<>();
		ArrayList <Shift> nightShift = new ArrayList<>();
		
//		for(ArrayList<Shift> e : shifts) {
//			for(Shift j : earlyShift) {
//				if(!earlyShift.contains(employees.get(j.getEmployee().))) {
//					System.out.println());
//				}
//			}
//			for(Shift m : lateShift) {
//				
//			}
//			for(Shift n : nightShift) {
//				
//			}	
//		}
//		Shift lateShift = new LateShift();
//		Shift nightShift = new NightShift();
		shifts.add(earlyShift);
		shifts.add(lateShift);
		shifts.add(nightShift);
		
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
		
		
		
		HashMap <Character, ArrayList<Employee>> shiftToEmployee = new HashMap<>();
		HashMap <Integer, String> idToName = new HashMap<>();
		HashMap <Character, String> dateToId = new HashMap<>();
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
					System.out.println("Insert employee in a shift\t\t|1\nRemove employee from shift\t\t|2\nShow employees in current shifts\t|3\n");
					int userInput3 = sc.nextInt();
					
					if (userInput3 == 1) {
						System.out.println("Employees available are: ");
						for (Employee e : employees) {
							for(ArrayList<Shift> g : shifts) {
								for(Shift j : earlyShift) {
									if(!earlyShift.contains(e)) {
										System.out.println(e.toString());
									}
								}
								for(Shift m : lateShift) {
									System.out.println(e.toString());
									
								}
								for(Shift n : nightShift) {
									System.out.println(e.toString());
									
								}
								
							}
						}
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
						for(Employee e : employees) {
							if(e.getName() == fullName) {
								idToName.put(e.getId(), e.getName());
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
								System.out.println(e.toString() + " has been added to employees\n");
								System.out.println(idToName);
							}

						}
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
					            if (e.getId() == id) {
					                itr.remove();
					            	System.out.println(e.toString() + " has been removed\n");
					            }
						 }
//						for (int i = 0; i < employees.size(); i++) {
//							if (employees.get(i).getId() == id) {
//								itr.remove();
//						employees.remove(new Employee(idToName.get(id)));
//								System.out.println(employees.get(i).toString() + " has been removed\n");
//							}
//						}
						System.out.print("Enter something to return to main menu or press 'f' to exit the programm");
						char userInputToOutput = sc.next().charAt(0);
						if (userInputToOutput == 'f') {
							breakP++;
						}
					} else if (userInput3 == 3) {							
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
	
		} while(breakP<=1);
		System.out.println("We wish you a good day!");
		sc.close();
	}
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

