package AbstractFactory;

public class SterDrukNisRozdz implements SterownikDrukarki {
    public void drukuj(){
        new SDNR().drukuj();
    }
}
