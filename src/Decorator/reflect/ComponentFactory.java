package Decorator.reflect;

import Decorator.DekoratorPotwierdzenie;
import Decorator.Komponent;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ComponentFactory implements IComponentFactory {

	private final Map<String, Class<? extends Komponent>> register;

	public ComponentFactory() {
		this.register = new HashMap<>();
	}

	@Override
	public Komponent create(String name, Komponent component) {
		Class<?> clazz = register.get(name);
		if (clazz == null) throw new NoSuchElementException(name);

		try {
			Constructor<?> constructor = clazz.getDeclaredConstructor(Komponent.class);
			return (Komponent) constructor.newInstance(component);
		} catch (Exception e) {
			try {
				return new DekoratorPotwierdzenie(component);
			} catch (Exception ex) {
				throw new RuntimeException(e);
			}
		}
	}

	@Override @SafeVarargs
	public final void register(Class<? extends Komponent> ... classes) {
		for (Class<? extends Komponent> c : classes) {
			ComponentType t = c.getDeclaredAnnotation(ComponentType.class);
			if (t == null)
				throw new IllegalArgumentException("Class should be annotated: " + ComponentType.class.getSimpleName());
			if (register.containsKey(t.value()))
				throw new IllegalArgumentException("Component already exists: " + t.value());
			register.put(t.value(), c);
		}
	}
}
