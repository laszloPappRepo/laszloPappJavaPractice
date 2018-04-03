//A számítógép hozzon létre egy véletlen számot a [0..100] intervallumban!
//A felhasználónak a feladata a szám kitalálása, a számítógép írja ki, hogy a tipp „Túl nagy”, vagy „Túl kicsi”

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        GameMessage gameMessage = new GameMessage();

        int guessedNumber;
        boolean guessGameLoop = true;

        System.out.println(gameMessage.start);

        Scanner scannedNumber = new Scanner(System.in);

        try {
            guessedNumber = Integer.parseInt(scannedNumber.nextLine());
            while (guessGameLoop) {
                if (numberToGuess > guessedNumber) {
                    System.out.println(gameMessage.greater);
                    guessedNumber = Integer.parseInt(scannedNumber.nextLine());
                } else if (numberToGuess < guessedNumber) {
                    System.out.println(gameMessage.smaller);
                    guessedNumber = Integer.parseInt(scannedNumber.nextLine());
                } else if (numberToGuess == guessedNumber) {
                    System.out.println(gameMessage.win);
                    guessGameLoop = false;
                }
            }
        }catch (NumberFormatException NFE){
            System.out.println(gameMessage.over);
        }
    }
}
