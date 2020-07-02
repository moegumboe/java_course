package chapter2;

import java.util.Scanner;

/*
 * MESSING WITH STRINGS
 * Create a program that asks a user for a season of the year,
 * Then a whole number, then an adjective. Use the input to complete the sentence below
 * Then output the result:
 * "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
 */

public class StringExercise {

    public static void main(String args[]){

        //1. Ask user for season of the year
        System.out.println("Think of a Season and type it out");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. ask for a whole number
        System.out.println("Now a whole number from 1-9");
        int wholeNumber = scanner.nextInt();

        //3. ask for an adjective
        System.out.println("Lastly, an adjective");
        String adjective = scanner.next();

        //4. input variables into the following sentence
        System.out.println("On a "+ adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");

    }
}
