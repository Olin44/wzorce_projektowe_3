package AbstractFactory;

public class ApNadzorujaca {
    FabrykaSter fabrykaSter;

    public ApNadzorujaca(Konfiguracja konfiguracja) throws Exception {
        this.fabrykaSter = konfiguracja.getFabryka();
    }

    public void drukuj(){
        fabrykaSter.pobierzSterDruk().drukuj();
    }

    public void rysuj(){
        fabrykaSter.pobierzSterEkm().rysuj();
    }

    public void setFabrykaSter(Konfiguracja konfiguracja) throws Exception {
        this.fabrykaSter = konfiguracja.getFabryka();
    }
}
