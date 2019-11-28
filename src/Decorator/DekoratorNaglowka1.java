package Decorator;

public class DekoratorNaglowka1 extends DekoratorPotwierdzenie{
    public DekoratorNaglowka1(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        drkNaglowka();
        super.drukuj();
    }

    public void drkNaglowka(){
        System.out.println("Naglowek 1");
    }
}
