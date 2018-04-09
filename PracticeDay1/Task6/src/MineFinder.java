import java.util.*;

public class MineFinder {

    public static char[][] box = new char[6][6];

    public static void main(String[] args) {
        tableDrawer();
        int guessedNumberX;
        int guessedNumberY;
        boolean gameLoop = true;
        Scanner scannedNumber = new Scanner(System.in);

        System.out.println("Start");
        for (int i = 0; i < shipPositioner().size(); i++) {
            try {
                guessedNumberX = Integer.parseInt(scannedNumber.nextLine());
                guessedNumberY = Integer.parseInt(scannedNumber.nextLine());
                while (gameLoop) {
                    if ((guessedNumberX == shipPositioner().get(i).coordX) && (guessedNumberY == shipPositioner().get(i).coordY)) {
                        System.out.println("Target has been destroyed.");
                        guessedNumberX = Integer.parseInt(scannedNumber.nextLine());
                        guessedNumberY = Integer.parseInt(scannedNumber.nextLine());
                    } else {
                        guessedNumberX = Integer.parseInt(scannedNumber.nextLine());
                        guessedNumberY = Integer.parseInt(scannedNumber.nextLine());
                    }
                }
            } catch (NumberFormatException NFE) {
                System.out.println("Game over!");
            }
        }
    }

    public static void tableDrawer(){

        for(int row = 1; row < box.length; row++) {
            for(int column = 1; column < box.length; column++) {
                if(row % 2 == 1) {
                    System.out.print("O ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
    }

    public static List<Ship> shipPositioner(){
        List<Integer> randomNumList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 1; i < 7; i++) {
            int randShipPos = rand.nextInt(6) + 1;
            randomNumList.add(randShipPos);
        }
        Ship a = new Ship(randomNumList.get(0),randomNumList.get(1));
        Ship b = new Ship(randomNumList.get(2),randomNumList.get(3));
        Ship c = new Ship(randomNumList.get(4),randomNumList.get(5));
        List<Ship> positionedFleet = Arrays.asList(a,b,c);
        return positionedFleet;
    }
}

