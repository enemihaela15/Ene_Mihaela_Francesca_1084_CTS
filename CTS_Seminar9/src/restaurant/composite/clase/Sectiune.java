package restaurant.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item {
    private String nume;
    private List<Item> listaOptiuni;
    public Sectiune(String nume) {
        this.nume = nume;
        this.listaOptiuni = new ArrayList<>();
    }

    @Override
    public void adaugareItem(Item item) throws Exception {
        this.listaOptiuni.add(item);
    }

    @Override
    public void stergereItem(Item item) throws Exception {
        this.listaOptiuni.remove(item);
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare + nume);
        for(Item item:this.listaOptiuni) {
            item.descriere(indentare + "  ");
        }
    }

    @Override
    public Item getItem(int position) throws Exception {
        return this.listaOptiuni.get(position);
    }
}
