package restaurant.template.main;

import restaurant.template.clase.MasaLocal;
import restaurant.template.clase.MasaRestaurant;
import restaurant.template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        MasaRestaurant masaLocal = new MasaLocal(20);
        masaLocal.ocupaMasa();

        System.out.println();

        MasaRestaurant masaRezervata = new MasaRezervata(25, "18:30");
        masaRezervata.ocupaMasa();
    }
}
