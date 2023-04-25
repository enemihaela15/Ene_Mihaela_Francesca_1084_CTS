package restaurant.composite.main;

import restaurant.composite.clase.Item;
import restaurant.composite.clase.Produs;
import restaurant.composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Item menu = new Sectiune("Meniu restaurant");
        // sectiuni
        Item sectiuneBauturi = new Sectiune("Bauturi");
        Item sectiuneStartere = new Sectiune("Starter");
        Item sectiuneDesert = new Sectiune("Desert");

        // subsectiuni
        Item subsectiuneCafea = new Sectiune("Cafea");
        Item subsectiuneApa = new Sectiune("Apa");

        // produse
        Item produsCafeaNeagra = new Produs("Cafea neagra");
        Item produsCafeaArabica = new Produs("Cafea arabica");
        Item produsApaPlata = new Produs("Apa Plata");
        Item produsApaMinerala = new Produs("Apa minerala");
        Item produsSucAcidulat = new Produs("Suc acidulat");

        try {
            subsectiuneApa.adaugareItem(produsApaMinerala);
            subsectiuneApa.adaugareItem(produsApaPlata);
            subsectiuneCafea.adaugareItem(produsCafeaArabica);
            subsectiuneCafea.adaugareItem(produsCafeaNeagra);

            sectiuneBauturi.adaugareItem(subsectiuneApa);
            sectiuneBauturi.adaugareItem(subsectiuneCafea);
            sectiuneBauturi.adaugareItem(produsSucAcidulat);

            menu.adaugareItem(sectiuneBauturi);
            menu.adaugareItem(sectiuneStartere);
            menu.adaugareItem(sectiuneDesert);

            menu.descriere("   ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
