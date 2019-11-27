package AbstractFactory;

public class SterDrukNisRozdz extends SterownikDrukarki {
    public void drukuj(){
        new SDNR().drukuj();
    }
}
