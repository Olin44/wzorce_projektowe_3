package Decorator;

public class DekoratorNaglowka1 extends DekoratorPotwierdzenie{
    DekoratorNaglowka1(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        drkNaglowka();
        super.drukuj();
    }

    private void drkNaglowka(){
        System.out.println("Naglowek 1");
    }
}
