package restaurant.facade.clase;

public class Restaurant {
    private MeseRestaurant meseRestaurant;
    private Ospatar ospatar;

    public Restaurant() {
        this.meseRestaurant = new MeseRestaurant();
        meseRestaurant.adaugaMasa(new Masa(true, true, 1));
        meseRestaurant.adaugaMasa(new Masa(false, true, 2));
        meseRestaurant.adaugaMasa(new Masa(true, true, 3));
        meseRestaurant.adaugaMasa(new Masa(false, false, 4));

        this.ospatar = new Ospatar();
        ospatar.debaraseazaMasa(2);
        ospatar.debaraseazaMasa(3);
    }
    public String verificareDisponibilitateMasa(int nrMasa) {
        if(meseRestaurant.esteLibera(nrMasa)) {
            if(ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa)) {
                return "Masa " + nrMasa +" este libera si puteti lua loc!";
            } else {
                return "Masa "+ nrMasa +" este libera, asteptati sa fie debarasata!";
            }
        }
        return "Masa " + nrMasa + " nu este libera!";
    }
}
