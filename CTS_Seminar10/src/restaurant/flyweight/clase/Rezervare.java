package restaurant.flyweight.clase;

public class Rezervare {
    private int id;
    private int nrMasa;
    private int nrPersoane;
    private int oraRezervare;

    public Rezervare(int id, int nrMasa, int nrPersoane, int oraRezervare) {
        this.id = id;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public int getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare=" + oraRezervare +
                '}';
    }
}
