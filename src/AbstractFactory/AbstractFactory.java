package AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        ApNadzorujaca apNadzorujaca= null;
        try {
            apNadzorujaca = new ApNadzorujaca(new Konfiguracja("WYS"));
        } catch(Exception e) {
            e.printStackTrace();
        }
        apNadzorujaca.drukuj();
        apNadzorujaca.rysuj();
    }
}

