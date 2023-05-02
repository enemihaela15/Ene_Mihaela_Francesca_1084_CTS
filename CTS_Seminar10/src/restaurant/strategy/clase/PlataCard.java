package restaurant.strategy.clase;

public class PlataCard implements IModPlata{
    @Override
    public void plateste(String nume, double valoare) {
        System.out.println("Clientul "+nume+" a platit cu CARDUL suma de "+valoare);
    }
}
