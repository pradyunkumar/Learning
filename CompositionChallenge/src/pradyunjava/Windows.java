package pradyunjava;

public class Windows {

    private int number;
    private Dimensions dimensions;
    private String type;

    public Windows(int number, Dimensions dimensions, String type){
        this.number = number;
        this.dimensions = dimensions;
        this.type = type;
    }

    public void openWindow(){
        System.out.println("Open the window!");
    }

    public int getNumber() {
        return number;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getType() {
        return type;
    }
}
