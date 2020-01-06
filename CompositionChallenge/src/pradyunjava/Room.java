package pradyunjava;

public class Room {

    private Floor floor;
    private Windows windows;
    private Furniture furniture;

    public Room(Floor floor, Windows windows, Furniture furniture) {
        this.floor = floor;
        this.windows = windows;
        this.furniture = furniture;
    }

    public void Clean(){
        System.out.println("Clean " + floor.getMaterial());
    }

    private Floor getFloor() {
        return floor;
    }

    public Windows getWindows() {
        return windows;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
