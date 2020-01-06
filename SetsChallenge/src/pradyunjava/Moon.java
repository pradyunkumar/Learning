package pradyunjava;

import java.util.HashSet;
import java.util.Set;

public final class Moon extends HeavenlyBody{
    private static final Set<Moon> allMoons = new HashSet<>();
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        allMoons.add(this);
    }

    @Override
    public boolean addSatellites(HeavenlyBody h) {
        System.out.println("Moons cannot have moons.");
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Set<HeavenlyBody> getSatellites() {
        System.out.println("Moons don't have satellites");
        return null;
    }

    public static Set<Moon> getAllMoons(){
        return new HashSet<>(allMoons);
    }
}
