package restaurant.decorator.main;

import restaurant.decorator.clase.*;
import restaurant.facade.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata("23-03-2023");
        notaDePlata.printeazaNotaDePlata(230);
        System.out.println();

        Decorator notaPlataPaste = new DecoratorPasteFericit(notaDePlata);
        notaPlataPaste.printeazaFelicitare();
        notaPlataPaste.printeazaNotaDePlata(250);
        System.out.println();

        Decorator notaPlataLaMultiAni = new DecoratorLaMultiAni(notaPlataPaste);
//        notaPlataLaMultiAni.printeazaFelicitare();
        notaPlataLaMultiAni.printeazaNotaDePlata(250);
    }
}
