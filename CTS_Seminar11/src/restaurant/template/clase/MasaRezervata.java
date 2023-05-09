package restaurant.template.clase;

public class MasaRezervata extends MasaRestaurant{

    private String oraRezervare;
    public MasaRezervata(int nrMasa, String oraRezervare) {
        super(nrMasa);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Curata masa " + getNrMasa() + " pentru rezervarea de la ora "+ oraRezervare +"!");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Aseaza tacamurile pe masa " + getNrMasa()+ " pentru rezervarea de la ora "+ oraRezervare +"!");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Aseaza servetelele pe masa " + getNrMasa()+ " pentru rezervarea de la ora "+ oraRezervare +"!");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Va asteptam la masa " + getNrMasa() +" la ora " + oraRezervare + "!");
    }
}
