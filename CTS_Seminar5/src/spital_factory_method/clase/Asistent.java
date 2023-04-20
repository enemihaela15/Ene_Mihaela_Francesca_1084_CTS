package spital_factory_method.clase;

public class Asistent implements PersonalSpital{

    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul: "+this.nume);
    }
}
