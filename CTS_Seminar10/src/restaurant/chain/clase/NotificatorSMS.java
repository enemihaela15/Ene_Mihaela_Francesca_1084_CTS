package restaurant.chain.clase;

public class NotificatorSMS extends Notificator{


    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getNrTelefon()!=null) {
            System.out.println("Clientul " + client.getNume() + " a primit un SMS cu mesajul "+ mesaj);
        } else if(this.getSuccesor()!=null) {
            super.getSuccesor().notificaClient(client, mesaj);
        } else {
            System.out.println("Clientul "+client.getNume()+" NU poate fi notificat.");
        }
    }
}
