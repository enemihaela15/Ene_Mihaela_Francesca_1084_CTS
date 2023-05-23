package restaurant.adapter.bucatarie;

public class SoftRestaurant implements ISoftRestaurant{
    private String bucatar;

    public SoftRestaurant(String bucatar) {
        this.bucatar = bucatar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("Bucatarul " + this.bucatar);
        System.out.println("Nota dumneavoastra este in valoare de "+ totalSuma);
    }
}
