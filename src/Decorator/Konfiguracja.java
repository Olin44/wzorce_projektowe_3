package Decorator;

public class Konfiguracja {
    Komponent komponent;

    public Konfiguracja() {}

    void dekorujPotwierdzenie(Komponent komponent){
        this.komponent = komponent;
        }

    public Komponent pobierzPotwierdzenie(){
        return this.komponent;
    }
}
