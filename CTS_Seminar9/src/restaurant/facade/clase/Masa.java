package restaurant.facade.clase;

public class Masa {
    private Boolean masaLibera;
    private Boolean areServeteleNoi;
    private int nrMasa;

    public Masa(Boolean masaLibera, Boolean areServeteleNoi, int nrMasa) {
        this.masaLibera = masaLibera;
        this.areServeteleNoi = areServeteleNoi;
        this.nrMasa = nrMasa;
    }

    public Boolean getMasaLibera() {
        return masaLibera;
    }

    public Boolean getAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void setMasaLibera(Boolean masaLibera) {
        this.masaLibera = masaLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }


}
