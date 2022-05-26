import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Press 1 to start");
		int breakP = 1;
		Scanner sc = new Scanner(System.in);
		char userInput = sc.next().charAt(0);
		do {
			if (userInput == '1') {
				// Nur zum testen der Funktion, werden sp�ter sysout mit storagedrive ersetzen
				System.out.println("");
				System.out.println("");
				System.out.println("Was moechten sie tuen ?");
				System.out.println("Schicht löschen: 1		" + "		Schicht verschieben 2		"
						+ "		Schicht eintragen 3");

				char userInput2 = sc.next().charAt(0);
				
				//Rohbau CMD bedienelemente
				if (userInput2 == '1') {
					System.out.println("Eintrag wird geloescht");
					System.out.println("");
					System.out.println("");
					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f druecken");
					System.out.println("");
					System.out.println("");
					char userInputToOutput = sc.next().charAt(0);
					if(userInputToOutput == 'f') {
						breakP++;
					}

				} else if (userInput2 == '2') {
					System.out.println("Eintrag wird verschoben");
					System.out.println("");
					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f drueckem");
					System.out.println("");
					System.out.println("");
					char userInputToOutput = sc.next().charAt(0);
					if(userInputToOutput == 'f') {
						breakP++;
					}

				} else if (userInput2 == '3') {
					System.out.println("");
					System.out.println("");
					
					System.out.println("Eintrag wurde erstellt");
					System.out.print("Beliebige eingabe um zurueck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f druecken");
					System.out.println("");
					System.out.println("");
					char userInputToOutput = sc.next().charAt(0);
					if(userInputToOutput == 'f') {
						breakP++;
					}

				}

			} else {
				// Auch nur zum testen
				System.out.println("Falsch");
			}
		} while (breakP <=1 );
		System.out.println("Wir w�nschen ihnen einen guten Tag");

		sc.close();
	}
}
