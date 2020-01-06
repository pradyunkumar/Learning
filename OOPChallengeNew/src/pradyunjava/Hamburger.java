package pradyunjava;

public class Hamburger {

    private String name;
    private String breadroll;
    private String veggie;
    private double price;

    private String addition1;
    private double addition1price = 0;
    private String addition2;
    private double addition2price = 0;
    private String addition3;
    private double addition3price = 0;
    private String addition4;
    private double addition4price = 0;

    public Hamburger() {
        this("normal","wheat", "tomato", 3);
    }

    public Hamburger(String name, String breadroll, String veggie, double price) {
        this.name = name;
        this.breadroll = breadroll;
        this.veggie = veggie;
        this.price = price;
    }

    public void setAddition1(String addition1, double addition1price) {
        this.addition1 = addition1;
        this.addition1price = addition1price;
    }

    public void setAddition2(String addition2, double addition2price) {
        this.addition2 = addition2;
        this.addition2price = addition2price;
    }

    public void setAddition3(String addition3, double addition3price) {
        this.addition3 = addition3;
        this.addition3price = addition3price;
    }

    public void setAddition4(String addition4, double addition4price) {
        this.addition4 = addition4;
        this.addition4price = addition4price;
    }

    public double getPrice(){
        return (price + (addition1price + addition2price + addition3price + addition4price));
    }

    public void purchaseRecap() {
        System.out.println("Base price of " + name + " is: $" + price);
        System.out.println("Final Price after additions: $" + getPrice());
        System.out.println("Additions: ");
        if (addition1 != null) {
            System.out.println(addition1 + " for $" + addition1price);
        }
        if (addition2 != null) {
            System.out.println(addition2 + " for $" + addition2price);
        }
        if (addition3 != null) {
            System.out.println(addition3 + " for $" + addition3price);
        }
        if (addition4 != null) {
            System.out.println(addition4 + " for $" + addition4price);
        } else {
            System.out.println("none");
        }
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public double getBasePrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}