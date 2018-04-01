import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        GameMessage gameMessage = new GameMessage();

        int guessedNumber;
        boolean loop = true;

        System.out.println(gameMessage.getStart());

        Scanner scannedNumber = new Scanner(System.in);

        try {
            guessedNumber = Integer.parseInt(scannedNumber.nextLine());
            while (loop) {
                if (numberToGuess > guessedNumber) {
                    System.out.println(gameMessage.getGreater());
                    guessedNumber = Integer.parseInt(scannedNumber.nextLine());
                } else if (numberToGuess < guessedNumber) {
                    System.out.println(gameMessage.getSmaller());
                    guessedNumber = Integer.parseInt(scannedNumber.nextLine());
                } else if (numberToGuess == guessedNumber) {
                    System.out.println(gameMessage.getWin());
                    loop = false;
                }
            }
        }catch (NumberFormatException NFE){
            System.out.println(gameMessage.getOver());
        }
    }
}
