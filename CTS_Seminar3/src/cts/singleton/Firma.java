package cts.singleton;

import java.util.HashMap;
import java.util.Map;

public class Firma {
    private String nume;
    private int nrAngajati;
    private static Map<String, Firma> registru = new HashMap<>() ;

    private Firma(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static Firma getFirma(String nume) {
        if (registru.containsKey(nume)) {
            return registru.get(nume);
        } else {
            Firma firma = new Firma(nume, 0);
            registru.put(nume, firma);
            return firma;
        }
    }
}
