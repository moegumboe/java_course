package LambdaPractice.Second_Lambda_Practice;

public class TypeInterferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));
    }


    interface StringLengthLambda {
        int getLength(String s);
    }


}
