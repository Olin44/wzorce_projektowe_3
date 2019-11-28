package Decorator;

public abstract class DekoratorPotwierdzenie implements Komponent {
    private Komponent komponent;

    public DekoratorPotwierdzenie(Komponent komponent) {
        this.komponent = komponent;
    }

    public void drukuj(){
        komponent.drukuj();
    }
}
