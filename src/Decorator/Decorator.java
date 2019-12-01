package Decorator;

import java.util.Arrays;
import java.util.Collections;


public class Decorator {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();

        Komponent komponent = zamowienie.generujPotwierdzenie(
                new DekoratorNaglowka1(new DekoratorStopki1(new DekoratorStopki2(new Potwierdzenie()))));

        Komponent komponent1 = zamowienie.generujPotwierdzenie(
                new DekoratorNaglowka1(new DekoratorNaglowka2(new DekoratorStopki2(new DekoratorStopki2(new Potwierdzenie())))));

        Komponent komponent2 = zamowienie.generujPotwierdzenie(new Potwierdzenie());

        zamowienie.drukuj(Arrays.asList(komponent, komponent1, komponent2));
    }
}
