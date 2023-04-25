package restaurant.facade.main;

import restaurant.facade.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        System.out.println(restaurant.verificareDisponibilitateMasa(1));
        System.out.println(restaurant.verificareDisponibilitateMasa(2));
        System.out.println(restaurant.verificareDisponibilitateMasa(3));
        System.out.println(restaurant.verificareDisponibilitateMasa(4));
    }
}