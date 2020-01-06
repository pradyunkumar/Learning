package pradyunjava;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }//changing this code would affect other methods using this method
    //right now there is no way to keep the method signature from changing
}
