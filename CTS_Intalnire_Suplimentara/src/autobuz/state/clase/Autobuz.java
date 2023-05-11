package autobuz.state.clase;

public class Autobuz {
    private int nrAutobuz;
    private StareAutobuz stareAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stareAutobuz = new StareLaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public StareAutobuz getStareAutobuz() {
        return stareAutobuz;
    }

    protected void setStareAutobuz(StareAutobuz stareAutobuz) {
        this.stareAutobuz = stareAutobuz;
    }

    public void pleacaInCursa() {
        StareAutobuz stare = new StareInCursa();
        stare.changeState(this);
    }

    public void pleacaInService() {
        StareAutobuz stare = new StareLaReparat();
        stare.changeState(this);
    }

    public void ajungeLaSfDeRuta() {
        StareAutobuz stare = new StareLaCapatDeLinie();
        stare.changeState(this);
    }
}
