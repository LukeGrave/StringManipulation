import java.util.Scanner;
import java.io.*;

public class cäsarChiffre {

public static void main(String[] args) {

	Scanner sc1 = new Scanner(System.in);	

	String input = "Dieser Text gehört codiert und im Anschluss wieder zurück zum Ursprung decodiert.";	// Text
	String output = "";	// Finished Process Output
	int key;		// key for char shift

//****** Ceasar ******

	System.out.println("Type in Text to en-/decode");
	input = sc1.nextLine();		//nextLine() to put in whole input!!

	System.out.println("Type in Key for shift [+/- 1-23 for reasonable workflow recommended]");
	key = sc1.nextInt();

	if ((key >= 1 && key <= 23) || (key <= -1 && key >= -23))
	{
		for (int i = 0; i < input.length(); i++)	//Loop through each char of text
		{
			//for char(i) from input.length(i) shift by key value.
			char c = (char)(input.charAt(i) + key);		// c = char from input.char@location + shift
			output += c;					//append shifted char onto output
		}
		//SUMMERY
		System.out.println(input);
		System.out.println("shift: " + key);
		System.out.println(output);
	}
	else
	{
		System.out.println("You broke the key off in the lock!");	//Schönes Zitat aus ANNO 1800
	}	
	sc1.close();
}
