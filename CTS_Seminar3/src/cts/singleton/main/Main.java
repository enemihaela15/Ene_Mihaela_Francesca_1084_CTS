package cts.singleton.main;

import cts.singleton.Decan;
import cts.singleton.Firma;
import cts.singleton.Rector;

public class Main {
    public static void main(String[] args) {
        // Lazy initialization
//        Rector rector1 = Rector.getInstanta("Popescu Ion", 2, 50);
//        Rector rector2 = Rector.getInstanta("Marinescu Mihai", 3, 60);
//
//        System.out.println(rector1);
//        System.out.println(rector2);
//
//        // Eager initialization
//        Decan decan1 = Decan.getInstanta();
//        Decan decan2 = Decan.getInstanta();
//        decan2.setNume("Gheorghe Ion");
//        System.out.println(decan1.getNume());
//        System.out.println(decan2.getNume());

        // Singleton Registry
        Firma firma1 = Firma.getFirma("Firma1");
        Firma firma2 = Firma.getFirma("Firma2");
        Firma firma3 = Firma.getFirma("Firma3");
        Firma firma4 = Firma.getFirma("Firma1");

        firma1.setNrAngajati(10);
        firma2.setNrAngajati(15);
        firma3.setNrAngajati(7);
        firma4.setNrAngajati(20);

        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());
        System.out.println(firma4.toString());

    }
}