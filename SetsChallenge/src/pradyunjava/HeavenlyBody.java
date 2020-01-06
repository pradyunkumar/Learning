package pradyunjava;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private String name;
    private double orbitalPeriod;
    private Set<HeavenlyBody> satellites;
    private HeavenlyBody actualType;

    public HeavenlyBody(String bodyType, String name, double orbitalPeriod){
        if(bodyType.equalsIgnoreCase("Star")){
            actualType = new Star(name, orbitalPeriod);
        } else if(bodyType.equalsIgnoreCase("Moon")){
            actualType = new Moon(name, orbitalPeriod);
        } else if(bodyType.equalsIgnoreCase("Planet")){
            actualType = new Planet(name, orbitalPeriod);
        } else {
            System.out.println("The body type is invalid.");
            System.exit(0);
        }
        this.orbitalPeriod = orbitalPeriod;
        this.name = name;
        this.satellites = new HashSet<>();
    }

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
    }
    //    public HeavenlyBody(String name, double orbitalPeriod){
//        actualType.setName(name);
//        actualType.setOrbitalPeriod(orbitalPeriod);
//
//    }
//    public HeavenlyBody(HeavenlyBody actualType){
//        this.actualType = actualType;
//        this.name = actualType.getName();
//        this.orbitalPeriod = actualType.getOrbitalPeriod();
//        this.satellites = new HashSet<>();
//    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellites(HeavenlyBody h) {
        return actualType.addSatellites(h);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + obj.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }
}
