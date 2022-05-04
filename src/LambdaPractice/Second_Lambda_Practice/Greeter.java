package LambdaPractice.Second_Lambda_Practice;

public class Greeter {

//    stringLambdaFunction = () -> System.out.println("Hello World");
//
//    multiplicationLambdaFunction = (int a) -> a * 2;
//
//    addLambdaFunction = (int a, int b) -> a + b;
//
//    divisionLambdaFunction = (int a, int b) -> {
//        b==0 ? 0 : a/b;
//    };
//
//    stringLengthCountFunction = (String s) ->  s.length();


    public void greet(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        HelloWorldGreeting hwg = new HelloWorldGreeting();
        Greeting myLambdaFunction = () -> System.out.println("greeting the world!");

        hwg.greet();
        myLambdaFunction.greet();
    }

}
