package chapter4;

/*
 *DO WHILE LOOP
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        boolean again;
        do {
            System.out.println("Enter the first number");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber+secondNumber;

            System.out.println("The sum of your numbers is " + sum);

            System.out.println("Would you like to start over? Enter true or false");
            again = scanner.nextBoolean();
        }while(again);
    }
}
