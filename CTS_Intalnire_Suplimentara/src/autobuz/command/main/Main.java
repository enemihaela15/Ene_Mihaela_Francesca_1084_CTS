package autobuz.command.main;

import autobuz.command.clase.Autobuz;
import autobuz.command.clase.Automobil;
import autobuz.command.clase.ComandPlecareInCursa;
import autobuz.command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil autobuz = new Autobuz(2);

        managerComenzi.invocaComanda(new ComandPlecareInCursa(20, new Autobuz(1)));
        managerComenzi.invocaComanda(new ComandPlecareInCursa(21, autobuz));
        managerComenzi.invocaComanda(new ComandPlecareInCursa(22, new Autobuz(3)));
        managerComenzi.invocaComanda(new ComandPlecareInCursa(21, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandPlecareInCursa(20, new Autobuz(23)));
        managerComenzi.executaComanda();
    }
}