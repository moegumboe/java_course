package chapter4;

import java.util.Scanner;
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class WhileLoop {
    public static void main(String args[]){

        int rate = 15;
        int maxHours = 40;

        //ask the user how many hours they worked
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("You cannot do overtime, please try again!");
            hoursWorked = scanner.nextDouble();
            scanner.close();
        }

        System.out.println("You will make $"+hoursWorked*rate+" this week!!!");

    }
}
