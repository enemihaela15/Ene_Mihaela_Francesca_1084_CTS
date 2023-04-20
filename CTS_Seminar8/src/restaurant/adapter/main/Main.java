package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.ISoftRestaurant;
import restaurant.adapter.bucatarie.SoftRestaurant;

public class Main {

    public static void imprimare(ISoftRestaurant restaurant, double valoare) {
        restaurant.printeazaNota(valoare);
    }


    public static void main(String[] args) {
        ISoftBar softBar = new SoftBar("Bar1");
//        softBar.printeazaNotaBauturi(250);

        ISoftRestaurant softRestaurant = new SoftRestaurant("Bucatar1");
//        softRestaurant.printeazaNota(300);

//        Main.imprimare(softBar, 300);
        Main.imprimare(softRestaurant, 200);

        AdapterRestaurant adapterRestaurant = new AdapterRestaurant("Restaurant");
        Main.imprimare(adapterRestaurant, 450);

        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(softBar);
        Main.imprimare(adapterObiecte, 300);
    }
}