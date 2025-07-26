package xyz.puppet57;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner myObj = new java.util.Scanner(System.in);  // Create a Scanner object
        System.out.print("Se Se Lu Lu to english [E] or english to Se Se Lu Lu [S]?: ");

        // The variable name means English to Se Se Lu Lu or Se Se Lu Lu to English
        // I didn't know what else to name it
        String EtoSorStoE = myObj.nextLine();  // Read user input
        int Lang = 1;

        if (Objects.equals(EtoSorStoE.toLowerCase(), "e")) {
            System.out.print("Type your Se Se Lu Lu: ");
        } else if (Objects.equals(EtoSorStoE.toLowerCase(), "s")) {
            System.out.print("Type your English: ");
            Lang = 2;
        }

        String Sentence = myObj.nextLine();
        String ConvertedSentence;

        if (Lang == 1) {
            ConvertedSentence = Translator.ConvertFrom(Sentence);
        } else {
            ConvertedSentence = Translator.ConvertTo(Sentence);
        }

        System.out.println("Converted sentence: " + ConvertedSentence);
    }
}