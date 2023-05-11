package autobuz.state.clase;

public class StareLaReparat implements StareAutobuz{
    @Override
    public void changeState(Autobuz autobuz) {
        if(autobuz.getStareAutobuz() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" va intra in service");
            autobuz.setStareAutobuz(this);
        } else {
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" nu poate intra in service");
        }
    }
}
