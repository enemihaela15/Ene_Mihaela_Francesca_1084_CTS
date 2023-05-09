package autobuz.memento.clase;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String nume, float consumMediu, String model, int anFabricatie, int nrLocuri) {
        this.numeSofer = nume;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public void restaurareAutobuz(MementoAutobuz mementoAutobuz){
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }

    public MementoAutobuz creareMemento() {
        MementoAutobuz mementoAutobuz = new MementoAutobuz(numeSofer, consumMediu);
        return mementoAutobuz;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
