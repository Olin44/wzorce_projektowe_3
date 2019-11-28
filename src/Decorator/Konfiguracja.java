package Decorator;

public class Konfiguracja {
    Komponent komponent;
    public Konfiguracja(Komponent komponent) {
        this.komponent = komponent;
    }

    void dekorujPotwierdzenie(Dekoratory dekorator){
        switch (dekorator){
            case NAGLOWEK1:
                this.komponent = new DekoratorNaglowka1(this.komponent);
                break;
            case NAGLOWEK2:
                this.komponent = new DekoratorNaglowka2(this.komponent);
                break;
            case STOPKA1:
                this.komponent = new DekoratorStopki1(this.komponent);
                break;
            case STOPKA2:
                this.komponent = new DekoratorStopki2(this.komponent);
                break;
        }
    }

    public Komponent pobierzPotwierdzenie(){
        return this.komponent;
    }
}
