package pradyunjava;

public class EnhancedPlayer {

    private String name;
    private int hitpoints = 100;
    private String weapon;
    //Encapsulation

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(hitpoints > 0 && hitpoints <= 100){
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0){
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
