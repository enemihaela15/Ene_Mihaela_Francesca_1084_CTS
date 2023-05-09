package autobuz.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuze {
    List<MementoAutobuz> listaMemento;

    public OperatorAutobuze() {
        this.listaMemento = new ArrayList<>();;
    }

    public void adaugaMemento(MementoAutobuz mementoAutobuz) {
        this.listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMemento(int index) {
        return this.listaMemento.get(index);
    }
}
