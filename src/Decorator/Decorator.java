package Decorator;

import java.util.ArrayList;
import java.util.List;

public class Decorator {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();

        Komponent komponent = zamowienie.generujPotwierdzenie(
               new ArrayList<>(List.of(Dekoratory.NAGLOWEK1, Dekoratory.STOPKA1, Dekoratory.STOPKA2)));

        Komponent komponent1 = zamowienie.generujPotwierdzenie(
                new ArrayList<>(List.of(Dekoratory.NAGLOWEK1, Dekoratory.NAGLOWEK2,Dekoratory.STOPKA2)));

        Komponent komponent2 = zamowienie.generujPotwierdzenie(new ArrayList<>());

        zamowienie.drukuj(new ArrayList<>(List.of(komponent, komponent1, komponent2)));
    }
}
