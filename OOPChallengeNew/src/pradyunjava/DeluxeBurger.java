package pradyunjava;

public class DeluxeBurger extends Hamburger {

    private final String NO_GOOD = "Extra additions not allowed";
    private final String o = "none";

    private String chips;
    private double chipsPrice;
    private String drinks;
    private double drinksPrice;


    public DeluxeBurger(String breadroll, String veggie,
                        double price, String chips, double chipsPrice,
                        String drinks, double drinksPrice) {
        super("Deluxe Burger", breadroll, veggie, price);
        this.chips = chips;
        this.chipsPrice = chipsPrice;
        this.drinks = drinks;
        this.drinksPrice = drinksPrice;
    }

    @Override
    public void purchaseRecap() {
        super.purchaseRecap();
        double price = getPrice();
        System.out.println("Chips: " + chips + " for $" + chipsPrice + "\n" +
                "Drinks: " + drinks + " for $" + drinksPrice + "\n");
    }

    @Override
    public void setAddition1(String addition1, double addition1Price) {
        System.out.println(NO_GOOD);
    }

    @Override
    public void setAddition2(String addition2, double addition2price) {
        System.out.println(NO_GOOD);
    }

    @Override
    public void setAddition3(String addition3, double addition3price) {
        System.out.println(NO_GOOD);
    }

    @Override
    public void setAddition4(String addition4, double addition4price) {
        System.out.println(NO_GOOD);
    }

    @Override
    public double getPrice() {
        return chipsPrice + drinksPrice + getBasePrice();
    }
}
