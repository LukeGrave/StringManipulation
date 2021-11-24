package com.sattler;

import java.util.Scanner;

public class LeetSpeak {

    public static void main(String[] args) {

        /*	A => '@' B => '8' C => '(' D => 'D' E => '3' F => 'F'
         *  G => '6' H => '#' I => '!' J => 'J' K => 'K' L => '1'
         *  M => 'M' N => 'N' O => '0' P => 'P' Q => 'Q' R => 'R'
         *  S => '$' T => '7' U => 'U' V => 'V' W => 'W' X => 'X'
         *  Y => 'Y' Z => '2'
         */
        String input = "";
        char[] r = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] w = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7','U', 'V', 'W', 'X', 'Y', '2'};
        String output = "";
        char c;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Type in Text to translate");
        input = sc1.nextLine();		//input Text


        for (int i = 0; i < input.length(); i++)	//Index für jedes Zeichen im Input
        {
            c = (char)(input.charAt(i));			//save Zeichen aus Input an Stelle [i]
            for (int j = 0; j < r.length; j++)		//Abgleichschleife für c
            {
                c = Character.toUpperCase(c);		//Umwandlung Text in Uppercase
                if(c == r[j])
                {									//Abgleich Zeichen Text mit r[] - Umwandeln in Leet und Ausgabe
                    System.out.print(w[j]);
                    break;
                }
                else if (j == (r.length-1) && c != r[j])
                {									//Ausgabe Zeichen in original, wenn nicht im r[] vorhanden
                    System.out.print(c);
                    break;
                }
            }
        }				//Nachtrag: Key-Variable nicht nötig; direkte Ausgabe der Werte spart Zwischenspeicherspeicher
        sc1.close();
    }

}
