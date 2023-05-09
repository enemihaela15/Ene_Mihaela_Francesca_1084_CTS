package restaurant.template.clase;

public abstract class MasaRestaurant {
    private int nrMasa;

    public MasaRestaurant(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaTacamuri();
    protected abstract void aseazaServetele();
    protected abstract void invitaPersoane();

    public final void ocupaMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    public int getNrMasa() {
        return nrMasa;
    }
}
