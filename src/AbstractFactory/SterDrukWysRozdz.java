package AbstractFactory;

public class SterDrukWysRozdz extends SterownikDrukarki{

    @Override
    public void drukuj(){
        new SDWR().drukuj();
    }
}
