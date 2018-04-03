//Saját kalóznyelv létrehozása 2
//A nyelv nagyon hasonlít az angolra, csak minden szó első betűje a szó legvégére kerül és hozzádjuk,
//hogy arr (pl rum >> umrarr).
//Készítsünk fordítóprogramot, hogy a felhasználó által beírt szöveget, mondatot lefordítja és kiírjuk kalózul.
//(egy teljes mondatot átkonvertálunk (String > String[])

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pirate {

    public static void main(String[] args) {

        System.out.println(pirating("Damn ground rats"));
    }

    private static String pirating(String input) {
        List<String> inputWords = Arrays.asList(input.split(" "));
        List<String> piratedWords = new ArrayList<>();
        String pirating;
        String piratedString = "";

        for (int i = 0; i < inputWords.size(); i++) {
            pirating = inputWords.get(i).substring(1) + inputWords.get(i).charAt(0) + "arr";
            piratedWords.add(pirating);
        }

        for (int i = 0; i < piratedWords.size(); i++) {
            piratedString += piratedWords.get(i) + " ";
        }
        return piratedString;
    }
}
