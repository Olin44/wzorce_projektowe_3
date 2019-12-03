package AbstractFactory;

public class ApNadzorujaca {
    private FabrykaSter fabrykaSter;

    ApNadzorujaca(Konfiguracja konfiguracja) throws Exception {
        this.fabrykaSter = konfiguracja.getFabryka();
    }

    public void drukuj(){
        fabrykaSter.pobierzSterDruk().drukuj();
    }

    void rysuj(){
        fabrykaSter.pobierzSterEkm().rysuj();
    }

    void setFabrykaSter(Konfiguracja konfiguracja) throws Exception {
        this.fabrykaSter = konfiguracja.getFabryka();
    }
}
