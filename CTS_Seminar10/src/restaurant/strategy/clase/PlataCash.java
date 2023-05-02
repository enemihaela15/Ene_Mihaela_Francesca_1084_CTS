package restaurant.strategy.clase;

public class PlataCash implements IModPlata{
    @Override
    public void plateste(String nume, double valoare) {
        System.out.println("Clientul "+nume+" realizeaza plata CASH pentru suma de "+ valoare);
    }
}
