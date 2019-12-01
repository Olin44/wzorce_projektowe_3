package Decorator;



public class Decorator {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();

        // A
        zamowienie.generujPotwierdzenie("NAGLOWEK1", "STOPKA2", "STOPKA1");
		System.out.println(" ____ ");
        zamowienie.generujPotwierdzenie("NAGLOWEK1", "NAGLOWEK2", "STOPKA2");

		System.out.println(" ====================================== ");

		// B
		new DekoratorNaglowka1(new DekoratorStopki2(new DekoratorStopki1(new Potwierdzenie()))).drukuj();
		System.out.println(" ____ ");
		new DekoratorNaglowka1(new DekoratorNaglowka2(new DekoratorStopki2(new Potwierdzenie()))).drukuj();


		// A == B
    }
}
