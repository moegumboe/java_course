package LambdaPractice;

public class WellWisher {



    public static void main(String[] args) {

        String name = "Moe";
        char symbol = '!';
        MyInterface myInterface = (x, y) -> {
            System.out.println("Namaste");
            System.out.println("Namaste "+x+y);
        };

        MyInterface myInterface2 = (x, y) ->
            System.out.println("Hello "+x+y);

        myInterface2.greet(name,symbol);
    }



}
