package FactoryMethod;

public abstract class SzablonZapytania {
    String wykonajZapytanie(String nazwaDB, String specZapyt){
        String komendaDB;
        BazaDanych BD = utworzDB();
        System.out.println(formatujConnect(nazwaDB));
        komendaDB = formatujSelect(specZapyt);
        BD.wykonajSelect(komendaDB);
        return komendaDB;
    }

    protected abstract String formatujConnect(String nazwaDB);
    protected abstract String formatujSelect(String specZapyt);

    protected abstract BazaDanych utworzDB();


}
