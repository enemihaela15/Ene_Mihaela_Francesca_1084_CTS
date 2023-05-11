package restaurant.state.main;

import restaurant.state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.elibereazaMasa();
        masa.ocupaMasa();
        masa.rezervaMasa();
    }
}