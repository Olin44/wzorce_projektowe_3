package Decorator;

import Decorator.reflect.ComponentType;

@ComponentType("NAGLOWEK1")
public class DekoratorNaglowka1 extends DekoratorPotwierdzenie {
	public DekoratorNaglowka1(Komponent komponent) {
		super(komponent);
	}

	@Override
	public void drukuj() {
		drkNaglowka();
		super.drukuj();
	}

	public void drkNaglowka() {
		System.out.println("Naglowek 1");
	}
}
