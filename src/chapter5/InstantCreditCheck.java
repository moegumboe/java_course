package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);

    //Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String args[]){
        //Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(salary, creditScore);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats you have been approved!!!");
        }
        else{
            System.out.println("Unfortunately you have not been approved!!!");
        }
    }
}
