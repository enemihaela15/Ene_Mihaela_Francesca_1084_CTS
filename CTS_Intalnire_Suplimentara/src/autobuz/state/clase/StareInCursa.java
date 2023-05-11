package autobuz.state.clase;

public class StareInCursa implements StareAutobuz{
    @Override
    public void changeState(Autobuz autobuz) {
        if(autobuz.getStareAutobuz() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" a plecat pe o noua ruta");
            autobuz.setStareAutobuz(this);
        } else {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate pleca intr-o noua cursa");
        }
    }
}
