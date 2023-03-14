package cts.singleton;

public class Decan {
    private String nume;
    private static Decan instanta = new Decan("Ionescu Gabriel");

    private Decan(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static Decan getInstanta() {
        return instanta;
    }
}
