package restaurant.composite.clase;

public class Produs implements Item{
    private String name;

    public Produs(String name) {
        this.name = name;
    }

    @Override
    public void adaugareItem(Item item) throws Exception {
        throw new Exception();
    }

    @Override
    public void stergereItem(Item item) throws Exception {
        throw new Exception();

    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare + this.name);

    }

    @Override
    public Item getItem(int position) throws Exception {
        throw new Exception();
    }
}
