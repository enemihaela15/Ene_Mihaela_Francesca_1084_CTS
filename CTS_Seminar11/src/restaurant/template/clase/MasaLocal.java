package restaurant.template.clase;

public class MasaLocal extends MasaRestaurant{
    public MasaLocal(int nrMasa) {
        super(nrMasa);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Curata masa " + getNrMasa() + " deoarece oamenii asteapta la usa!");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Aseaza tacamurile pe masa " + getNrMasa()+ " pentru persoanele de la usa!");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Aseaza servetelele pe masa " + getNrMasa()+ " pentru persoanele de la usa!");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Invita persoanele de la usa la masa " + getNrMasa() +"!");
    }
}
