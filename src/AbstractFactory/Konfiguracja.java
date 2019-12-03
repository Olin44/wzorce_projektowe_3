package AbstractFactory;

class Konfiguracja {
    private String nazwa;

    Konfiguracja(String nazwa) {
        this.nazwa = nazwa;
    }

    FabrykaSter getFabryka() throws Exception {
        if(nazwa.equals("NIS")){
            return new FabrykaNisRozdz();
        }
        if(nazwa.equals("WYS")){
            return new FabrykaWysRozdz();
        }
        else{
            throw new Exception("Nie ma takiej fabryki");
        }
    }
}
