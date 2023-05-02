package restaurant.observer.clase;

public class ClientRestaurant implements IObserver{
    private String nume;

    public ClientRestaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul "+ nume+" primeste mesajul "+ mesaj);
    }
}
