package FactoryMethod;

public abstract class SzablonZapytania {
    public String wykonajZapytanie(String nazwaDB, String specZapyt){
        String komendaDB;
        BazaDanych BD = utworzDB();
        System.out.println(formatujConnect(nazwaDB));
        komendaDB = formatujSelect(specZapyt);
        return komendaDB;
    }

    protected abstract String formatujConnect(String nazwaDB);
    protected abstract String formatujSelect(String specZapyt);

    public BazaDanych utworzDB(){
        return new BazaDanych() {
            @Override
            public void wykonajSelect() {
                System.out.println();
            }
        };}

}
