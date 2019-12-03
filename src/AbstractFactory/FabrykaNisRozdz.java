package AbstractFactory;

public class FabrykaNisRozdz implements FabrykaSter {

    @Override
    public SterownikEkranu pobierzSterEkm() {
        return new SterEkmNisRozdz();
    }

    @Override
    public SterownikDrukarki pobierzSterDruk() {
        return new SterDrukNisRozdz();
    }
}
