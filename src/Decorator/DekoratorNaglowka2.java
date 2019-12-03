package Decorator;

public class DekoratorNaglowka2 extends DekoratorPotwierdzenie{
    DekoratorNaglowka2(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        drkNaglowka();
        super.drukuj();
    }

    private void drkNaglowka(){
        System.out.println("Naglowek 2");
    }
}
