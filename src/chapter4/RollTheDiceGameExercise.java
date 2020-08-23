package chapter4;

import java.util.Random;

public class RollTheDiceGameExercise {
    public static void main(String args[]){
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        int maxSpaces = 20;
        int total = 0;
        int maxTolls = 5;

        for (int i=1; i<=maxTolls; i++){
            if (total < 20){
                total+=dice;
                System.out.println("Roll #"+(i+1) + ": You've rolled a " + dice +
                        " and have " + (maxSpaces-total) + " left to get to 20");
                dice = random.nextInt(6)+1;
            }
        }



    }
}
