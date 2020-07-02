package chapter3;

import java.util.Scanner;
/*
 * IF STATEMENT
 * Scenario:
 * All sales people get a payment of $1000 a week.
 * Salespeople who exceed 10 sales get an additional bonus of $250.
 */

public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int quota = 10;

        //Get the unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (sales >= 10)
            System.out.println("Congratulations you achieved your sales goal :)");
        else{
            System.out.println("You almost had it, you just needed " + (10 - sales) + " more sales.");
        }
    }
}
