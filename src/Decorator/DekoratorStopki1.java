package Decorator;

public class DekoratorStopki1 extends DekoratorPotwierdzenie{
    public DekoratorStopki1(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        super.drukuj();
        drkStopka();
    }

    public void drkStopka(){
        System.out.println("Stopka 1");
    }
}
