package AbstractFactory;

public class SterEkmNisRozdz extends SterownikEkranu {

    @Override
    public void rysuj(){
        new SENR().rysuj();
    }
}
