package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * And have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]){

        //Initialize what we know
        int salaryMinimum = 30000;
        int minimunYearsWorked = 2;

        //Get what we don't know
        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("How many years have you worked there?");
        double yearsWorked = scanner.nextDouble();

        //Make decision
        if (salary >= salaryMinimum){
            if (yearsWorked >= minimunYearsWorked){
                System.out.println("You are eligible for a loan! Congrats!");
            }
            else{
                System.out.println("Sorry you do not meet the minimum required years" +
                        "at your current job. You need a minimum of " + minimunYearsWorked +
                        " years.");
            }
        }
        else{
            System.out.println("Sorry you must earn at least $ " +
                    salaryMinimum + " to qualify.");
        }
    }
}
