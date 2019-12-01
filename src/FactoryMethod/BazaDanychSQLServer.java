package FactoryMethod;

public class BazaDanychSQLServer implements BazaDanych {
    @Override
    public void wykonajSelect() {
        System.out.println("Wykonuję select do BazaDanychSQLServer");

    }
}
