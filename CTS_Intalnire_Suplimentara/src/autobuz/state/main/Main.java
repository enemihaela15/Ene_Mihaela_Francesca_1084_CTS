package autobuz.state.main;

import autobuz.state.clase.Autobuz;
import autobuz.state.clase.StareAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(2);

        autobuz.pleacaInService();
        autobuz.ajungeLaSfDeRuta();
        autobuz.ajungeLaSfDeRuta();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaSfDeRuta();
    }
}
