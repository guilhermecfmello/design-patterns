package creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Divinity {

    public static List<OrbsPrototype> cloneOrbs(List<OrbsPrototype> orbsList) {
        List<OrbsPrototype> newList = new ArrayList<>();
        for(OrbsPrototype orb : orbsList) {
            newList.add(orb.clone());
        }
        return newList;
    }

    public static void printOrbs(List<OrbsPrototype> orbsList) {
        for(OrbsPrototype orb : orbsList) {
            System.out.println("Orb name: " + orb.getOrbName());
        }
    }
}