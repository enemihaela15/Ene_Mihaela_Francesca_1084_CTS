package autobuz.command.clase;

public class ComandPlecareInCursa implements ICommand{
    private int numarLinie;
    private Automobil automobil;

    public ComandPlecareInCursa(int nrLinie, Automobil automobil) {
        this.numarLinie = nrLinie;
        this.automobil = automobil;
    }


    @Override
    public void execute() {
        automobil.plecareCursa(this.numarLinie);
    }
}
