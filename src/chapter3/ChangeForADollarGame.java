package chapter3;

/*
 * CHANGE FOR A DOLLAR GAME
 * The objective of the game is to enter enough change to equal exactly one dollar
 */

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        //how many pennies would you like?
        System.out.println("how many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextInt() * penny;

        System.out.println("how many nickles would you like?");
        pennies += scanner.nextInt() * nickel;

        System.out.println("how many dimes would you like?");
        pennies += scanner.nextInt() * dime;

        System.out.println("how many quarters would you like?");
        pennies += scanner.nextInt() * quarter;

        scanner.close();

        if (pennies == dollar){
            System.out.println("WooHoo! That's exactly $1.00, you win!");
        }else if (pennies > dollar){
            System.out.println("You were over by " + String.format("%.2f",(pennies - dollar)));
        }else{
            System.out.println("You were short by " + String.format("%.2f",(dollar - pennies)));
        }

    }
}
