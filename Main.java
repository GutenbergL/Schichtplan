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
				// Nur zum testen der Funktion, werden sp�ter sysout mit storagedrive ersetzen
				System.out.println("");
				System.out.println("");
				System.out.println("Was m�chten sie tuen ?");
				System.out.println("Schicht l�schen: 1		" + "		Schicht verschieben 2		"
						+ "		Schicht eintragen 3");

				char userInput2 = sc.next().charAt(0);
				
				//Rohbau CMD bedienelemente
				if (userInput2 == '1') {
					System.out.println("Eintrag wird gel�scht");
					System.out.println("");
					System.out.println("");
					System.out.print("Beliebige eingabe um zur�ck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f dr�cken");
					System.out.println("");
					System.out.println("");
					char userInputToOutput = sc.next().charAt(0);
					if(userInputToOutput == 'f') {
						breakP++;
					}

				} else if (userInput2 == '2') {
					System.out.println("Eintrag wird verschoben");
					System.out.println("");
					System.out.print("Beliebige eingabe um zur�ck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f dr�cken");
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
					System.out.print("Beliebige eingabe um zur�ck zur Auswahl zu kommen"+" oder "+"Zum verlassen des Programms f dr�cken");
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
