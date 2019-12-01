package Decorator;

import Decorator.reflect.ComponentType;

@ComponentType("NAGLOWEK2")
public class DekoratorNaglowka2 extends DekoratorPotwierdzenie {
	public DekoratorNaglowka2(Komponent komponent) {
		super(komponent);
	}

	@Override
	public void drukuj() {
		drkNaglowka();
		super.drukuj();
	}

	public void drkNaglowka() {
		System.out.println("Naglowek 2");
	}
}
