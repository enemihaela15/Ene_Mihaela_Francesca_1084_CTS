package restaurant.flyweight.main;

import restaurant.flyweight.clase.FabricaClienti;
import restaurant.flyweight.clase.IClient;
import restaurant.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();

        Rezervare rezervare1 = new Rezervare(1, 1, 2, 16);
        Rezervare rezervare2 = new Rezervare(2, 2, 3, 18);
        Rezervare rezervare3 = new Rezervare(3, 4, 4, 19);
        Rezervare rezervare4 = new Rezervare(4, 3, 8, 20);

        IClient client1 = fabricaClienti.getClient("Popescu");
        IClient client2 = fabricaClienti.getClient("Ionescu");

        client1.descriereDetaliiRezervare(rezervare1);
        fabricaClienti.getClient("Popescu").descriereDetaliiRezervare(rezervare2);

        client2.descriereDetaliiRezervare(rezervare3);
        fabricaClienti.getClient("Ionescu").descriereDetaliiRezervare(rezervare4);
    }
}