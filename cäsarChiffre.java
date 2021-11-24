import java.util.Scanner;
import java.io.*;

public class cäsarChiffre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	Erstelle Programm mit einer Variable mit Text -- Scanner Aufnahme-Maximum checken
		 * Text einlesen und verschlüsseln -- geeigneten Type erörtern
		 * Key setzen -- char[] verschieben -- existiert ein package mit allen Zeichen, oder selbst eintippen?
		 */
		
		Scanner sc1 = new Scanner(System.in);	//	Option Encode or Decode Text
		Scanner sc2 = new Scanner(System.in);	//	Import Text
		Scanner sc3 = new Scanner(System.in);	//	define Key
		
		String input = "Dieser Text gehört codiert und im Anschluss wieder zurück zum Ursprung decodiert.";	// Text
		String output = "";	// Finished Process Output
		int opt;			// Encode - Decode Mode
		int key;			// Schlüssel (Verschiebung der Zeichen)
		boolean work = false;//false bis Auftrag ausgeführt
		
	//****** Ceasar ******
		while (work == false)
		{
			System.out.println("[1] Encode - [2] Decode");
			opt = sc1.nextInt();
			
			if(opt == 1)	//Encode
			{
				System.out.println("Type in Text to encode");
				input = sc2.nextLine();		//nextLine(), da sonst nur das erste Wort genommen wird!!
				
				System.out.println("Type in Key for shift [+/- 1-23 for reasonable workflow recommended]");
				key = sc3.nextInt();
				
				if ((key >= 1 && key <= 23) || (key <= -1 && key >= -23))
				{
					for (int i = 0; i < input.length(); i++)	//Loop through each char of text
					{
										//für char(i) von input.length(i) soll Wert um key verschoben werden.
						char c = (char)(input.charAt(i) + key);			// c = Zeichen aus Input.Zeichen@location + verschiebung
						output += c;									//anhängen von verschobenen Zeichen an String Output
					}
					
					System.out.println(input);				//Ausgabe von input
					System.out.println("shift: " + key);	//Ausgabe von key
					System.out.println(output);				//Ausgabe von output
					
					work = true;
				}
				else
				{
					System.out.println("You broke the key off in the lock!");	//Schönes Zitat aus ANNO 1800
				}
			}
			else if (opt == 2)	//Decode
			{
				System.out.println("Type in Text to decode");
				input = sc2.nextLine();
				
				System.out.println("Type in Key for shift [+/- 1-23 for reasonable workflow recommended]");
				key = sc3.nextInt();
				
				if ((key >= 1 && key <= 23) || (key <= -1 && key >= -23))
				{
					for (int i = 0; i < input.length(); i++)	
					{
						char c = (char)(input.charAt(i) + key);			
						output += c;
					}
					
					System.out.println(input);				
					System.out.println("shift: " + key);	
					System.out.println(output);				
					
					work = true;
				}
				else
				{
					System.out.println("You broke the key off in the lock!");
				}
			}
			else
			{
				System.out.println("Invalid Input");
			}
			 
		}
		sc1.close();
		sc2.close();
		sc3.close();
		/*	To do:
		 * 	Input eines externen Text-Files mittels Reader und Scanner
		 * 	Speichern des Outputs in ein neues Text-File!
		 */
	}
}
