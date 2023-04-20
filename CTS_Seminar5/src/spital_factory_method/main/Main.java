package spital_factory_method.main;

import spital_factory_method.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryMedic = new FactoryMedic();
        Factory factoryAsistent = new FactoryAsistent();
        Factory factoryAnestezist = new FactoryAnestezist();
        Factory factoryInfirmier = new FactoryInfirmier();
        List<PersonalSpital> listaAngajati = new ArrayList<>();

        listaAngajati.add(factoryMedic.createPersonal("Ionescu"));
        listaAngajati.add(factoryAsistent.createPersonal("Popescu"));
        listaAngajati.add(factoryAsistent.createPersonal("Gheorghe"));
        listaAngajati.add(factoryMedic.createPersonal("Marinescu"));
        listaAngajati.add(factoryAnestezist.createPersonal("Gigel"));

        Infirmier infirmier1 = (Infirmier) factoryInfirmier.createPersonal("Ion");
        infirmier1.setAnVechime(10);

        listaAngajati.add(infirmier1);

        for(PersonalSpital angajat: listaAngajati) {
            angajat.descriere();
        }

    }
}
