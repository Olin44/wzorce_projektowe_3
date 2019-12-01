package FactoryMethod;

public class ZapytanieSQLServer extends SzablonZapytania{
    @Override
    protected String formatujConnect(String nazwaDB) {
        return "Nazwiązano połączenie z bazą " + nazwaDB;
    }

    @Override
    protected String formatujSelect(String specZapyt) {
        return specZapyt;
    }
}
