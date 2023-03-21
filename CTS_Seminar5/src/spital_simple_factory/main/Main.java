package spital_simple_factory.main;

import spital_simple_factory.Factory;
import spital_simple_factory.PersonalSpital;
import spital_simple_factory.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalSpital p1 = factory.createInstance(TipPersonalSpital.Asistent, "Ionescu");
        PersonalSpital p2 = factory.createInstance(TipPersonalSpital.Medic, "Popescu");
        PersonalSpital p3 = factory.createInstance(TipPersonalSpital.Brancardier, "Gheorghe");

        p1.descriere();
        p2.descriere();
        p3.descriere();

        List<PersonalSpital> listaAngajati = new ArrayList<>();
        listaAngajati.add(p1);
        listaAngajati.add(p2);
        listaAngajati.add(p3);
        listaAngajati.add(factory.createInstance(TipPersonalSpital.Brancardier, "Marinescu"));
        listaAngajati.add(factory.createInstance(TipPersonalSpital.Medic, "Georgescu"));
        listaAngajati.add(factory.createInstance(TipPersonalSpital.Asistent, "Antonescu"));
        listaAngajati.add(factory.createInstance(TipPersonalSpital.Asistent, "Avramescu"));
        listaAngajati.add(factory.createInstance(TipPersonalSpital.Anestezist, "Bran"));


        System.out.println("Lista angajati:");
        for(PersonalSpital angajat : listaAngajati) {
            angajat.descriere();
        }
    }
}