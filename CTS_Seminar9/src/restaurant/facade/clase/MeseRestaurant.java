package restaurant.facade.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeseRestaurant {
    private Map<Integer, Masa> listaMese;
    public MeseRestaurant() {
        listaMese = new HashMap<>();
    }

    public void adaugaMasa(Masa masa) {
        listaMese.put(masa.getNrMasa(), masa);
    }

    public boolean esteLibera(int nrMasa) {
        return listaMese.get(nrMasa).getMasaLibera();
    }

    public boolean suntServeteleNoi(int nrMasa) {
        return listaMese.get(nrMasa).getAreServeteleNoi();
    }
}
