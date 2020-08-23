package chapter5;

import java.util.Scanner;

public class CreatingMethods {
    public static void main(String args[]){

        System.out.println("Enter you name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);

    }}
