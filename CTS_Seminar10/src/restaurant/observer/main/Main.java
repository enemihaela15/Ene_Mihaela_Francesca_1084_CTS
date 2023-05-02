package restaurant.observer.main;

import restaurant.observer.clase.ClientRestaurant;
import restaurant.observer.clase.IObserver;
import restaurant.observer.clase.Restaurant;
import restaurant.observer.clase.Subject;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("ABC");

        IObserver client1 = new ClientRestaurant("Popescu");
        IObserver client2 = new ClientRestaurant("Georgescu");
        IObserver client3 = new ClientRestaurant("Marinescu");

        restaurant.adaugareObserver(client1);
        restaurant.adaugareObserver(client2);

        restaurant.notificaOfertaPret();
        restaurant.notificaSchimbareMeniu();

        restaurant.stergereObserver(client2);
        restaurant.adaugareObserver(client3);

        restaurant.notificaSchimbareMeniu();
    }
}
