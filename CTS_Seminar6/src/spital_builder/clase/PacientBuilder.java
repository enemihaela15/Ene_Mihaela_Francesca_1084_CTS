package spital_builder.clase;

public class PacientBuilder implements Builder{
    private Pacient pacient;
    public PacientBuilder(String nume) {
        this.pacient = new Pacient();
        pacient.setNume(nume);
    }

//    public PacientBuilder setNume(String nume) {
//        this.pacient.setNume(nume);
//        return this;
//    }

    public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(Boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
