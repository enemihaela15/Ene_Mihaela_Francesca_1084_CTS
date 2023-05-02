package restaurant.strategy.clase;

public class Client {
    private String numeClient;
    private IModPlata modPlata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.modPlata = new PlataCash();
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizeazaPlata(double valoare) {
        modPlata.plateste(this.numeClient, valoare);
    }
}
