package AbstractFactory;

public class SterEkmNisRozdz implements SterownikEkranu {

    @Override
    public void rysuj(){
        new SENR().rysuj();
    }
}
