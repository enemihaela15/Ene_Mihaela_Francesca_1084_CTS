package restaurant.state.clase;

public class Masa {
    private int nr;
    private Stare stare;

    public Masa(int nr){
        this.nr = nr;
        stare = new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
        Stare stare = new StareRezervata();
        stare.schimbareStare(this);
    }

    public void ocupaMasa() {
        Stare stare = new StareOcupata();
        stare.schimbareStare(this);
    }

    public void elibereazaMasa() {
        Stare stare = new StareLibera();
        stare.schimbareStare(this);
    }

    public void anuleazaRezervare() {
        Stare stare = new StareLibera();
        stare.schimbareStare(this);
    }
}
