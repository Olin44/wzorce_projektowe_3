package Decorator.reflect;

import Decorator.Komponent;

public interface IComponentFactory {

	default Komponent create(String name) {
		return create(name, null);
	}

	Komponent create(String name, Komponent component);

	void register(Class<? extends Komponent> ... c);
}
