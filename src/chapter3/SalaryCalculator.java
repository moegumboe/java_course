package chapter3;

import java.util.Scanner;

/*
 * IF ELSE STATEMENT
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

public class SalaryCalculator {

    public static void main(String args[]){

        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        salary = sales > quota ? salary + bonus : salary;

        //Output
        System.out.println("The employee's pay is $"+salary);
    }
}
