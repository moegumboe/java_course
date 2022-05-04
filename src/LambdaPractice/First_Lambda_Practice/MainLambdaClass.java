package LambdaPractice.First_Lambda_Practice;

import java.util.ArrayList;



public class MainLambdaClass {
    /** ------------[LAMBDAS]--- parameter -> expression
     * Lambdas have no names or identifiers
     * -They can be passed as a parameter to another function
     * -They are paired with a functional interface and feature a parameter
     *      with an expression that references that parameter.
     */

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(11);
        numbers.forEach( (n) -> System.out.println(n+1));
    }
}
