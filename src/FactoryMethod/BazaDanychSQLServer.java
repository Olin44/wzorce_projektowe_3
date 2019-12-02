package FactoryMethod;

public class BazaDanychSQLServer implements BazaDanych {
    @Override
    public void wykonajSelect(String string) {
        System.out.println("Wykonuję zapytanie " + string + " do BazaDanychSQLServer");

    }
}
