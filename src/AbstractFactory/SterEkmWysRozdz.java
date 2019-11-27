package AbstractFactory;

public class SterEkmWysRozdz extends SterownikEkranu {

    @Override
    public void rysuj(){
        new SEWR().rysuj();
    }
}
