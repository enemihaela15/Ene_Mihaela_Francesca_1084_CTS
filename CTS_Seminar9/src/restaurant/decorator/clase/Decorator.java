package restaurant.decorator.clase;

public abstract class Decorator implements INotaDePlata {
    private INotaDePlata notaDePlata;

    public Decorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata(double totalDePlata) {
        this.notaDePlata.printeazaNotaDePlata(totalDePlata);
    }

    public abstract void printeazaFelicitare();
}
