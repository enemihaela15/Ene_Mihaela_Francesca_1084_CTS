package autobuz.state.clase;

public class StareLaCapatDeLinie implements StareAutobuz{
    @Override
    public void changeState(Autobuz autobuz) {
        if(!(autobuz.getStareAutobuz() instanceof StareLaCapatDeLinie)) {
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" a ajuns la capat de linie");
            autobuz.setStareAutobuz(this);
        } else {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate ajunge la capat de linie");
        }
    }
}
