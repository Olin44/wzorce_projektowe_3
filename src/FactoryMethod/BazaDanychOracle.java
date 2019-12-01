package FactoryMethod;

public class BazaDanychOracle implements BazaDanych {
    @Override
    public void wykonajSelect() {
        System.out.println("Wykonuję select do BazaDanychOracle");
    }
}
