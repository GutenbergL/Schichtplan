import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Zum starten geben sie die 1 ein");
		int breakP = 1;
		Scanner sc = new Scanner(System.in);
		char userInput = sc.next().charAt(0);
		do {
			if (userInput == '1') {
				// Nur zum testen der Funktion, werden später sysout mit storagedrive ersetzen
				System.out.println("");
				System.out.println("");
				System.out.println("Was möchten sie tuen ?");
				System.out.println("Schicht löschen: 1		" + "		Schicht verschieben 2		"
						+ "		Schicht eintragen 3");

				char userInput2 = sc.next().charAt(0);
				
				//Rohbau CMD bedienelemente
				if (userInput2 == '1') {
					System.out.println("Eintrag wird gelöscht");
					System.out.println("");
					System.out.println("");
					System.out.print("Beliebige eingabe um zurück zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f drücken");
					System.out.println("");
					System.out.println("");
					char userInputToOutput = sc.next().charAt(0);
					if(userInputToOutput == 'f') {
						breakP++;
					}

				} else if (userInput2 == '2') {
					System.out.println("Eintrag wird verschoben");
					System.out.println("");
					System.out.print("Beliebige eingabe um zurück zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f drücken");
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
					System.out.print("Beliebige eingabe um zurück zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f drücken");
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
		System.out.println("Wir wünschen ihnen einen guten Tag");

		sc.close();
	}
}
