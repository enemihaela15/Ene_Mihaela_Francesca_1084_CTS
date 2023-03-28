package spital_builder.clase;

public class Pacient {
    private Boolean patRabatabil;
    private Boolean micDejunInclus;
    private Boolean papuciDeCamera;
    private String nume;

    public Pacient() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.nume = "Anonim";
    }

    public Pacient(Boolean patRabatabil, Boolean micDejunInclus, Boolean papuciDeCamera, String nume) {
        super();
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.nume = nume;
    }

    public Pacient(Boolean patRabatabil, Boolean micDejunInclus, Boolean papuciDeCamera) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    protected void setPapuciDeCamera(Boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", nume='" + nume + '\'' +
                '}';
    }
}
