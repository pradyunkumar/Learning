package pradyunjava;

public class Case {
    private String name;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String name, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("power button pressed");
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
