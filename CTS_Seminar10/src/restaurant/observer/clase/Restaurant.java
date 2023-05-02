package restaurant.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
    private String nume;
    private List<IObserver> clienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void adaugareObserver(IObserver observer) {
        this.clienti.add(observer);
    }

    @Override
    public void stergereObserver(IObserver observer) {
        this.clienti.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for(IObserver client : this.clienti) {
            client.receptioneazaNotificare(mesaj);
        }
    }

    public void notificaOfertaPret(){
        this.notificaObserveri("Restaurantul "+ this.nume+" ofera reduceri de pret");
    }

    public void notificaSchimbareMeniu() {
        this.notificaObserveri("Restaurantul "+this.nume+" isi va schimba meniul");
    }
}
