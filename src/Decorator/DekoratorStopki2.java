package Decorator;

public class DekoratorStopki2 extends DekoratorPotwierdzenie{
    public DekoratorStopki2(Komponent komponent) {
        super(komponent);
    }

    @Override
    public void drukuj() {
        super.drukuj();
        drkStopka();
    }

    public void drkStopka(){
        System.out.println("Stopka 2");
    }
}