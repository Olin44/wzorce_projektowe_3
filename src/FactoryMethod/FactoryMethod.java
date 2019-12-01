package FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        ZapytanieOracle zapytanieOracle = new ZapytanieOracle();
        String zapytanie = "insert into tabela values dane";
        ZapytanieSQLServer zapytanieSQLServer = new ZapytanieSQLServer();
        System.out.println(zapytanieOracle.wykonajZapytanie("Oracle", zapytanie));
        System.out.println(zapytanieSQLServer.wykonajZapytanie("SQLServer", zapytanie));
    }
}
