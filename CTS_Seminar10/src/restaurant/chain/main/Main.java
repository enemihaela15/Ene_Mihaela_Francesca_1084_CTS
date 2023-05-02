package restaurant.chain.main;

import restaurant.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

//        notificatorSMS.setSuccesor(notificatorEmail);
//        notificatorEmail.setSuccesor(notificatorManager);

        notificatorEmail.setSuccesor(notificatorSMS);
        notificatorSMS.setSuccesor(notificatorManager);

        Client client1 = new Client("Popescu", "0760051421", "popescu@gmail.com");
        Client client2 = new Client("Ionescu", null, "ionescu@gmail.com");
        Client client3 = new Client("Georgescu", null, null);

        notificatorEmail.notificaClient(client1, "mesaj");
        notificatorEmail.notificaClient(client2, "mesaj");
        notificatorEmail.notificaClient(client3, "mesaj");
    }
}
