package Decorator;

import Decorator.reflect.ComponentFactory;
import Decorator.reflect.IComponentFactory;

@SuppressWarnings("unchecked")
public class Konfiguracja {

	private final IComponentFactory factory;

    public Konfiguracja() {
		factory = new ComponentFactory();
		factory.register(
				DekoratorNaglowka1.class,
				DekoratorNaglowka2.class,
				DekoratorStopki1.class,
				DekoratorStopki2.class,
				Potwierdzenie.class
		);
	}

    public Komponent pobierzPotwierdzenie(String ... decorators){
		Komponent last = new Potwierdzenie();
		for (int i = decorators.length - 1; i >= 0; i--)
			last = factory.create(decorators[i], last);
    	return last;
    }
}
