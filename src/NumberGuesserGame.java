import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {
    public static void main(String[] args) throws Exception {
        userGuess();
    }

    // generates a rnadom number
    public static int generateNumber(){
        Random generator = new Random();
        int number = generator.nextInt(20);
        System.out.println(number);
        return number;
    }

    // takes in user's guess
    public static void userGuess(){
        int randomNumber = generateNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess (1-20): ");
        int guess = input.nextInt();

    }

    // compares user guess to random number
    public static boolean compare(){
        return true;
    }



}
