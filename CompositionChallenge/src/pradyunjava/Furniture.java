package pradyunjava;

public class Furniture {

    private String F1;
    private String F2;
    private String F3;
    private String color;

    public Furniture(String F1, String F2, String F3, String color) {
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
        this.color = color;
    }

    public void rest(){
        if(F1.equals("couch") || F2.equals("couch") || F3.equals("couch")) {
            System.out.println("Sit down on the couch!");
        } else {
            System.out.println("Too bad, you can't!");
        }
    }

    public String getF1() {
        return F1;
    }

    public String getF2() {
        return F2;
    }

    public String getF3() {
        return F3;
    }

    public String getColor() {
        return color;
    }
}
