package cts.singletonregistry.main;

import cts.singletonregistry.Firma;
import cts.singletonregistry.Registru;

import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        Registru registru = new Registru();
        Registru registruNou=new Registru();
        Firma firma1 = registru.getFirma("Firma1");
        Firma firma2 = registru.getFirma("Firma2");
        Firma firma3 = registruNou.getFirma("Firma1");
        //Firma firma4=new Firma("Firma1",0);

        firma1.angajeaza();
        firma1.angajeaza();
        firma2.angajeaza();
        firma3.angajeaza();

        System.out.println(firma1.getNrAngajati());
        System.out.println(firma2.getNrAngajati());
        System.out.println(firma3.getNrAngajati());
    }
}
