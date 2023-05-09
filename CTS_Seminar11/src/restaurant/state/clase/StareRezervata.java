package restaurant.state.clase;

public class StareRezervata implements Stare{
    @Override
    public void schimbareStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera) {
            masa.setStare(this);
            System.out.println("Masa "+ masa.getNr()+" este rezervata");
        } else {
            System.out.println("Masa "+ masa.getNr()+" nu poate fi rezervata");
        }
    }
}
