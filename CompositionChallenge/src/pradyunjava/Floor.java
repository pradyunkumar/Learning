package pradyunjava;

public class Floor {

    private String material;
    private Dimensions dimensions;
    private String color;

    public Floor(String material, Dimensions dimensions, String color){
        this.material = material;
        this.dimensions = dimensions;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
