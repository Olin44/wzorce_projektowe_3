package Decorator;

import java.util.Arrays;
import java.util.Collections;


public class Decorator {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();

        Komponent komponent = zamowienie.generujPotwierdzenie(
                Arrays.asList(Dekoratory.NAGLOWEK1, Dekoratory.STOPKA1, Dekoratory.STOPKA2));

        Komponent komponent1 = zamowienie.generujPotwierdzenie(
                Arrays.asList(Dekoratory.NAGLOWEK1, Dekoratory.NAGLOWEK2,Dekoratory.STOPKA2));

        Komponent komponent2 = zamowienie.generujPotwierdzenie(Collections.emptyList());

        zamowienie.drukuj(Arrays.asList(komponent, komponent1, komponent2));
    }
}
