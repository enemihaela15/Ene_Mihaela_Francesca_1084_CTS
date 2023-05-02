package restaurant.strategy.main;

import restaurant.strategy.clase.Client;
import restaurant.strategy.clase.PlataCard;
import restaurant.strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionescu");
        client.realizeazaPlata(230);

        client.setModPlata(new PlataCard());
        client.realizeazaPlata(3500);

        client.setModPlata(new PlataCash());
        client.realizeazaPlata(400);
    }
}
