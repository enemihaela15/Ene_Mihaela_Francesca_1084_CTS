package restaurant.decorator.clase;

public class DecoratorLaMultiAni extends Decorator{
    public DecoratorLaMultiAni(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNotaDePlata(double totalDePlata) {
        super.printeazaNotaDePlata(totalDePlata);
        System.out.println("La multi ani");
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
