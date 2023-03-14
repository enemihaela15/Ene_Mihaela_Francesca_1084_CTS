package cts.singleton;

public class Rector {
    private String nume;
    private int numarMandate;
    private int varsta;
    private static Rector instanta = null;

    private Rector(String nume, int numarMandate, int varsta) {
        this.nume = nume;
        this.numarMandate = numarMandate;
        this.varsta = varsta;
    }

    public static synchronized Rector getInstanta(String nume, int numarMandate, int varsta) {
        if(instanta == null) {
            instanta = new Rector(nume, numarMandate, varsta);
        }
        return instanta;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarMandate() {
        return numarMandate;
    }

    public int getVarsta() {
        return varsta;
    }

    public static Rector getInstanta() {
        return instanta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNumarMandate(int numarMandate) {
        this.numarMandate = numarMandate;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static void setInstanta(Rector instanta) {
        Rector.instanta = instanta;
    }

    @Override
    public String toString() {
        return "Rector{" +
                "nume='" + nume + '\'' +
                ", numarMandate=" + numarMandate +
                ", varsta=" + varsta +
                '}';
    }
}
