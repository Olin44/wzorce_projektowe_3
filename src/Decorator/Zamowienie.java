package Decorator;

import java.util.List;

class Zamowienie {
    Komponent generujPotwierdzenie(Komponent komponent) {
        Konfiguracja konfiguracja = new Konfiguracja();
        konfiguracja.dekorujPotwierdzenie(komponent);
        return konfiguracja.pobierzPotwierdzenie();
    }

    public void drukuj(List<Komponent> komponenty){
        for(Komponent komponent : komponenty){
            komponent.drukuj();
            System.out.println("------------------------------------");
        }
    }

}
