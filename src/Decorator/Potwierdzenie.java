package Decorator;

import Decorator.reflect.ComponentType;

@ComponentType("POTWIERDZENIE")
public class Potwierdzenie implements Komponent {

    @Override
    public void drukuj() {
        System.out.println("Potwierdzenie");
    }
}
