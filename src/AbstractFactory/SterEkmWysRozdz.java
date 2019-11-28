package AbstractFactory;

public class SterEkmWysRozdz implements SterownikEkranu {

    @Override
    public void rysuj(){
        new SEWR().rysuj();
    }
}
