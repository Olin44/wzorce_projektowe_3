package Decorator;

public class DekoratorStopki1 extends DekoratorPotwierdzenie{
    DekoratorStopki1(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        super.drukuj();
        drkStopka();
    }

    private void drkStopka(){
        System.out.println("Stopka 1");
    }
}
