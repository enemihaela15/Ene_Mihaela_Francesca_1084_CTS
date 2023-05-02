package restaurant.flyweight.clase;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Client(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void descriereDetaliiRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+ this.nume + " a rezervat masa "+ rezervare.toString());
    }
}
