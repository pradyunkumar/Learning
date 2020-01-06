package pradyunjava;

import java.util.HashMap;
import java.util.Map;


public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Planet","Mercury", 88);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Planet","Venus", 225);
        solarSystem.put(temp.getName(), temp);
        

        temp = new HeavenlyBody("Planet","Earth", 365);
        solarSystem.put(temp.getName(), temp);
        

        HeavenlyBody tempMoon = new HeavenlyBody("Moon","Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new HeavenlyBody("Planet","Mars", 687);
        solarSystem.put(temp.getName(), temp);


        tempMoon = new HeavenlyBody("Moon","Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new HeavenlyBody("Moon","Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new HeavenlyBody("Planet","Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);


        tempMoon = new HeavenlyBody("Moon","Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new HeavenlyBody("Moon","Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new HeavenlyBody("Moon","Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new HeavenlyBody("Moon","Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);


        temp = new HeavenlyBody("Planet","Saturn", 10759);
        solarSystem.put(temp.getName(), temp);


        temp = new HeavenlyBody("Planet","Uranus", 30660);
        solarSystem.put(temp.getName(), temp);


        temp = new HeavenlyBody("Planet","Neptune", 165);
        solarSystem.put(temp.getName(), temp);


        temp = new HeavenlyBody("Planet","Pluto", 248);
        solarSystem.put(temp.getName(), temp);

        for(Planet p : Planet.getAllPlanets()){
            System.out.println(p.getName());
        }
    }
}
