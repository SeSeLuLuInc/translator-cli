package xyz.puppet57;

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        java.util.Scanner myObj = new java.util.Scanner(System.in);  // Create a Scanner object
        System.out.print("Se Se Lu Lu to english [E] or english to Se Se Lu Lu [S]?: ");

        // The variable name means English to Se Se Lu Lu or Se Se Lu Lu to English
        // I didn't know what else to name it
        String EtoSorStoE = myObj.nextLine();  // Read user input
        int Lang = 1;

        if (Objects.equals(EtoSorStoE, "E")) {
            System.out.print("Type your Se Se Lu Lu: ");
        } else if (Objects.equals(EtoSorStoE, "S")) {
            System.out.print("Type your English: ");
            Lang = 2;
        }

        // String Sentence = myObj.nextLine();

        // The replacement logic will go here
        // Lncvrt will probably make the replacement logic
    }
}