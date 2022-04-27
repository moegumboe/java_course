package LambdaPractice;

public class WellWisher {

    public static void wish(Greetings greetings){
        greetings.greet();
    }

    public static void main(String[] args) {
        wish( () -> System.out.println("Namaste"));
    }


}
