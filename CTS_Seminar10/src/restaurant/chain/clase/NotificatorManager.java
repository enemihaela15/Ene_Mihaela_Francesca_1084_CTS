package restaurant.chain.clase;

public class NotificatorManager extends Notificator{
    @Override
    public void notificaClient(Client client, String mesaj) {
        System.out.println("Pentru clientul "+ client.getNume()+" NU avem date de contact");
    }
}
