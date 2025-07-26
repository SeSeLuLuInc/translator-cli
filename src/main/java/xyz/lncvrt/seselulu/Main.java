package xyz.lncvrt.seselulu;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner inputReader = new java.util.Scanner(System.in);
        System.out.print("Se Se Lu Lu to english [E] or english to Se Se Lu Lu [S]?: ");

        String inputMode = inputReader.nextLine();

        int lang = 1;
        if (Objects.equals(inputMode.toLowerCase(), "e")) {
            System.out.print("Type your Se Se Lu Lu: ");
        } else if (Objects.equals(inputMode.toLowerCase(), "s")) {
            System.out.print("Type your English: ");
            lang = 2;
        } else {
            System.out.print("Invalid mode");
            return;
        }

        String inputSentence = inputReader.nextLine();

        String convertedSentence;
        if (lang == 1) {
            convertedSentence = Translator.convertFrom(inputSentence);
        } else {
            convertedSentence = Translator.convertTo(inputSentence);
        }

        System.out.println("Converted sentence: " + convertedSentence);
    }
}