package Decorator;

import java.util.List;

class Zamowienie {
    Komponent generujPotwierdzenie(List<Dekoratory> listaDekoratorow) {
        Konfiguracja konfiguracja = new Konfiguracja(new Potwierdzenie());
        for(Dekoratory dekorator : listaDekoratorow){
            konfiguracja.dekorujPotwierdzenie(dekorator);
        }
        Komponent komponent = konfiguracja.pobierzPotwierdzenie();
        return komponent;
    }

    public void drukuj(List<Komponent> komponenty){
        for(Komponent komponent : komponenty){
            komponent.drukuj();
            System.out.println("------------------------------------");
        }
    }

}
