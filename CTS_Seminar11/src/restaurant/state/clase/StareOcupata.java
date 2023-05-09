package restaurant.state.clase;

public class StareOcupata implements Stare{
    @Override
    public void schimbareStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)) {
            masa.setStare(this);
            System.out.println("Masa "+masa.getNr()+" este ocupata");
        } else {
            System.out.println("Masa "+ masa.getNr()+" nu poate fi ocupata");
        }
    }
}
