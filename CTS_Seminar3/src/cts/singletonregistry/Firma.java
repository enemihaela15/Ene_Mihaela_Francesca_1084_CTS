package cts.singletonregistry;

public class Firma {
    private String nume;
    private int nrAngajati;

    protected Firma(String nume, int nrAngajati) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
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

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }

    public void angajeaza() {
        this.nrAngajati++;
    }
}
