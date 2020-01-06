package pradyunjava;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor("carpet",
                new Dimensions(0.5, 20, 15), "tan");
        Windows windows = new Windows(2,
                new Dimensions(2, 2, 0.3), "normal");
        Furniture furniture = new Furniture
                ("couch", "bed", "desk", "black");

        Room myRoom = new Room(floor, windows, furniture);

        myRoom.Clean();
        myRoom.getWindows().openWindow();


    }
}
