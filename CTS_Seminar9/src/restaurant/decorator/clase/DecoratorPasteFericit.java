package restaurant.decorator.clase;

public class DecoratorPasteFericit extends Decorator {
    public DecoratorPasteFericit(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNotaDePlata(double totalDePlata) {
        super.printeazaNotaDePlata(totalDePlata);
        System.out.println("Paste fericit!");
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Paste fericit!");
    }
}
