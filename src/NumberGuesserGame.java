import java.util.Random;

public class NumberGuesserGame {
    public static void main(String[] args) throws Exception {
        userGuess();
    }

    public static int generateNumber(){
        Random generator = new Random();
        int number = generator.nextInt(20);
        System.out.println(number);
        return number;
    }

    public static void userGuess(){
        int randomNumber = generateNumber();
    }
}
