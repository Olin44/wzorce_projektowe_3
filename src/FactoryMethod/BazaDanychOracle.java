package FactoryMethod;

public class BazaDanychOracle implements BazaDanych {

    @Override
    public void wykonajSelect(String string) {
        System.out.println("Wykonuję zapytanie " + string + " do BazaDanychOracle");
    }
}
