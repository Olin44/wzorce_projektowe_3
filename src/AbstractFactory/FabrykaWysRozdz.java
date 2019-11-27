package AbstractFactory;

public class FabrykaWysRozdz implements FabrykaSter {
    @Override
    public SterownikEkranu pobierzSterEkm() {
        return new SterEkmWysRozdz();
    }

    @Override
    public SterownikDrukarki pobierzSterDruk() {
        return new SterDrukWysRozdz();
    }
}
