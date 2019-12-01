package Decorator;

public class DekoratorPotwierdzenie implements Komponent {
    private Komponent komponent;

    public DekoratorPotwierdzenie(Komponent komponent) {
        this.komponent = komponent;
    }

    public void drukuj(){
    	if (komponent != null)
			komponent.drukuj();
    }
}
