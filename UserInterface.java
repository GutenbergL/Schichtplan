import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

//	public void userInterface() {
//		System.out.println("Press 1 to start");
//		int breakP = 1;
//		Scanner sc = new Scanner(System.in);
//		char userInput = sc.next().charAt(0);
//		do {
//			if (userInput == '1') {
//				// Nur zum testen der Funktion, werden sp�ter sysout mit storagedrive ersetzen
//				System.out.println("");
//				System.out.println("");
//				System.out.println("Was moechten sie tuen ?");
//				System.out.println("Schicht löschen: 1		" + "		Schicht verschieben 2		"
//						+ "		Schicht eintragen 3");
//
//				char userInput2 = sc.next().charAt(0);
//
//				// Rohbau CMD bedienelemente
//				switch (userInput2) {
//				case '1':
//					System.out.println("Eintrag wird geloescht");
//					System.out.println("");
//					System.out.println("");
//					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//							+ "Zum verlassen des Programms f druecken");
//					System.out.println("");
//					System.out.println("");
//					char userInputToOutput = sc.next().charAt(0);
//					if (userInputToOutput == 'f') {
//						breakP++;
//					}
//					break;
//				case '2':
//					System.out.println("Eintrag wird verschoben");
//					System.out.println("");
//					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//							+ "Zum verlassen des Programms f drueckem");
//					System.out.println("");
//					System.out.println("");
//					char userInputToOutput2 = sc.next().charAt(0);
//					if (userInputToOutput2 == 'f') {
//						breakP++;
//					}
//					break;
//				case '3':
//					System.out.println("");
//					System.out.println("");
//
//					System.out.println("Eintrag wurde erstellt");
//					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
//							+ "Zum verlassen des Programms f druecken");
//					System.out.println("");
//					System.out.println("");
//					char userInputToOutput3 = sc.next().charAt(0);
//					if (userInputToOutput3 == 'f') {
//						breakP++;
//					}
//					break;
//				default:
//					// Auch nur zum testen
//					System.out.println("Falsch");
//					break;
//				}
//			}
//		} while (breakP <= 1);
//		System.out.println("Wir w�nschen ihnen einen guten Tag");
//
//		sc.close();
//	}

	public void employeeMenu() {
		int breakP = 1;
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add new Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Show current Employees");

			int userInput = sc.nextInt();

			if (userInput == 1) {
				System.out.println("Type the first name of the employee you want to add:");
				String fname = sc.next();
				System.out.println("Type the last name in: ");
				String lname = sc.next();
				String fullName = fname + " " + lname;
				employees.add(new Employee(fullName));
				for (Employee e : employees) {
					if (e.getName() == fullName) {
						System.out.println(e.toString() + " has been added to Employees\n");
					}
				}
				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
						+ "Zum verlassen des Programms f druecken");
				char userInputToOutput = sc.next().charAt(0);
				if (userInputToOutput == 'f') {
					breakP++;
				}
			} else if (userInput == 2) {
				System.out.println("Type the ID of the employee you want to delete");
				int id = sc.nextInt();
				for(Employee e : employees) {
					if(e.getId() == id) {
					employees.remove(e);
					System.out.println(e.toString() + " has been deleted");
				}
				}
				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
						+ "Zum verlassen des Programms f druecken");
				char userInputToOutput = sc.next().charAt(0);
				if (userInputToOutput == 'f') {
					breakP++;
				}
			} else if (userInput == 3) {
				for (Employee e : employees) {
					System.out.println(e);
				}
				System.out.println("Beliebige eingabe um zurueck zur Auswahl zu kommen" + " oder "
						+ "Zum verlassen des Programms f druecken");
				char userInputToOutput = sc.next().charAt(0);
				if (userInputToOutput == 'f') {
					breakP++;
				}
			}
		} while (breakP <= 1);
		System.out.println("Wir w�nschen ihnen einen guten Tag");
	}
}

//	public Employee addEmployee(String name) {
//		employees.add(new Employee(name));
//		return new Employee(name);
//	}
//
//	public void deleteEmployee(String name) {
//		for(Employee e : employees)
//		if(e.equals(name)) {
//		employees.remove(e);
//		}
