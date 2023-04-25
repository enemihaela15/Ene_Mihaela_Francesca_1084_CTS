package restaurant.decorator.clase;

public class NotaDePlata implements INotaDePlata {
    private String dataEmitere;

    public NotaDePlata(String dataEmitere) {
        this.dataEmitere = dataEmitere;
    }

    @Override
    public void printeazaNotaDePlata(double totalPlata) {
        System.out.println("Nota dumneavoastra de plata din " + dataEmitere +" este de " + totalPlata + " lei");
    }
}
