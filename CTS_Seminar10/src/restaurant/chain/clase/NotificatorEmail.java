package restaurant.chain.clase;

public class NotificatorEmail extends Notificator{
    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getAdresaEmail()!=null) {
            System.out.println("Clientul " + client.getNume() + " a primit un EMAIL cu mesajul "+ mesaj);
        } else if(this.getSuccesor()!=null) {
            super.getSuccesor().notificaClient(client, mesaj);
        } else {
            System.out.println("Clientul "+ client.getNume()+" NU poate fi notificat");
        }
    }
}
