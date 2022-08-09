package creation.prototype;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Planet earth = new Planet("earth", 5.972, "Solar system");
        Planet mars = new Planet("mars", 0.639, "Solar system");

        Star sun = new Star("sun", 1989000, 5504);
        Star sirius = new Star("sirius", 4773600, 9623);

        ArrayList<OrbsPrototype> orbsList = new ArrayList<OrbsPrototype>();

        orbsList.add(earth);
        orbsList.add(mars);
        orbsList.add(sun);
        orbsList.add(sirius);

        var newOrbList = (ArrayList<OrbsPrototype>) Divinity.cloneOrbs(orbsList);
        Divinity.printOrbs(Stream.concat(newOrbList.stream(), orbsList.stream()).toList());
    }
}