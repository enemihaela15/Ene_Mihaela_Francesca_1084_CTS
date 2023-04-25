package restaurant.composite.clase;

public interface Item {
    void adaugareItem(Item item) throws Exception;
    void stergereItem(Item item) throws Exception;
    void descriere(String indentare);
    Item getItem(int position) throws Exception;
}
