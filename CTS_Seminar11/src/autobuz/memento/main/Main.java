package autobuz.memento.main;

import autobuz.memento.clase.Autobuz;
import autobuz.memento.clase.MementoAutobuz;
import autobuz.memento.clase.OperatorAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Popescu", 15, "Model", 2020, 50);
        OperatorAutobuze operatorAutobuze = new OperatorAutobuze();
        System.out.println(autobuz.toString());

        operatorAutobuze.adaugaMemento(autobuz.creareMemento());
        autobuz.setConsumMediu(17);
        autobuz.setNumeSofer("Ionescu");
        System.out.println();
        System.out.println(autobuz.toString());

        operatorAutobuze.adaugaMemento(autobuz.creareMemento());
        autobuz.restaurareAutobuz(operatorAutobuze.getMemento(0));

        System.out.println();
        System.out.println(autobuz.toString());
    }
}
