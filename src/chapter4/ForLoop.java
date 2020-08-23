package chapter4;

/*
 * FOR LOOP
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class ForLoop {
    public static void main(String args[]){

        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
        //Create a loop to iterate through all of the items and accumulate the costs
        for (int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item?");
           double price = scanner.nextDouble();

           total += price;
        }
        scanner.close();
        System.out.println(total);
    }
}
