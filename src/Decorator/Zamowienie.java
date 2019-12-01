package Decorator;

class Zamowienie {

	public void generujPotwierdzenie(String ... dekoratory) {
        Konfiguracja konfiguracja = new Konfiguracja();
		Komponent komponent = konfiguracja.pobierzPotwierdzenie(dekoratory);
		komponent.drukuj();
	}

}
