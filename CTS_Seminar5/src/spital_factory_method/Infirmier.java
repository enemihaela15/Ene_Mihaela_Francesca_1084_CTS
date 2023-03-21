package spital_factory_method;

public class Infirmier implements PersonalSpital{
    private String nume;
    private int anVechime;

    public Infirmier(String nume, int anVechime) {
        this.nume = nume;
        this.anVechime = anVechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnVechime() {
        return anVechime;
    }

    public void setAnVechime(int anVechime) {
        this.anVechime = anVechime;
    }

    @Override
    public void descriere() {
        System.out.println("Infirmierul "+this.nume+" are "+ this.anVechime + " ani vechime");
    }
}
