//Hozzunk létre egy Póni osztályt!
//Az osztálynak legyen 3 privát adattagja, string szín, int végtagok száma, boolean tud-e repülni.
//A privát adattagokhoz hozzunk létrenyilvános függvényeket, melyek által írhatóak és olvashatóak lesznek az adattagok!
//A tud-e repülni adattagnál vegyük ki, hogy kívülről módosítható legyen.
//Hozzunk létre az osztályunkhoz egy konstruktort, melyben bemenő paraméterként várjuk a Póni típusú példány színét.
//A végtagok számát itt inicializáljuk 4-re.
//A main függvényben példányosítsunk 5 pónit.
//Tároljuk el a pónikat egy Póni típusú objektumokat tároló tömbben (legyen a változó neve ménes).
//Iteráljunk végig a tömbünkön és írjuk ki a konzolra a pónik színét külön-külön sorba.
//+1: Írjunk egy MakeAUnicorn függvényt a póni osztályunkba.
//A függvényben állítsuk át a Póni végtagjainak számát 6-ra (+2 szárny) és a tud-e repülni adattagját igazra.
//Hívjuk meg az unikornis függényünket a póni-példányaink közül legalább 2-re!
//+2: iteráljunk végig a csorda tömbünkön és számoljuk össze hány repülni tudó pónink van!
//Írjuk ki a számot és ezek színét a konzolra!

import java.util.Arrays;

public class FlyingPonyRainbowChocolateHappiness {

    public static void main(String[] args) {

        Pony JackpotStar = new Pony("gold");
        Pony ColtIce = new Pony("white");
        Pony DapperForce = new Pony("orange");
        Pony CrimsonMoon = new Pony("red");
        Pony ManuPony = new Pony("rainbow");

        Pony[] stable = new Pony[]{JackpotStar, ColtIce, DapperForce, CrimsonMoon, ManuPony};

        stable[4].makeUnicorn(ManuPony);
        stable[1].makeUnicorn(ColtIce);

        for (int i = 0; i < stable.length; i++) {
            System.out.println(stable[i].getColor() + " " + stable[i].getExtremities() + " " + stable[i].isCanFly());
        }
    }
}
