package pradyunjava;

public class HealthyBurger extends Hamburger{

    private String addition5;
    private double addition5price;
    private String addition6;
    private double addition6price;

    public HealthyBurger(String veggie, double price) {
        super("Healthy Burger","brown rye", veggie, price);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public void setAddition5(String addition5, double addition5price) {
        this.addition5 = addition5;
        this.addition5price = addition5price;
    }

    public void setAddition6(String addition6, double addition6price) {
        this.addition6 = addition6;
        this.addition6price = addition6price;
    }

    @Override
    public void purchaseRecap() {
        super.purchaseRecap();
        if(addition5 != null) {
            System.out.println(addition5 + " for $" + addition5price);
        }
        if(addition6 != null){
            System.out.println(addition6 + " for $" + addition6price);
        }
    }

    @Override
    public double getPrice() {
        return (super.getPrice() + addition5price + addition6price);
    }
}
