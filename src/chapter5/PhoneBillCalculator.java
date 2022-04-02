package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        //get the total of someone's bill
        double bill = getBill();

        //charge for going over
        double overage = getOverageCharge();

        //tax the user
        double tax = getTax(bill, overage);

        //get the total
        finalTotal(bill, overage, tax);
    }

    public static double getBill(){
        System.out.println("Enter your bill:");
        double plan = scanner.nextDouble();
        System.out.println("Plan: $" + plan);
        return plan;
    }

    public static double getOverageCharge(){
        System.out.println("Enter the amount of minutes you went over:");
        double overageMinutes = scanner.nextDouble() * .25;
        System.out.println("Overage: $" + overageMinutes);
        return overageMinutes;

    }

    public static double getTax(double bill, double overage){
        double tax = (bill+overage) * .15;
        System.out.println("Tax: $" + tax);
        return tax;
    }

    public static void finalTotal(double bill, double overage, double tax){

        System.out.println("Total: $" + (bill+overage+tax));
    }
}
