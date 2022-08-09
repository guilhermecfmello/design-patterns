package creation.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet implements OrbsPrototype {
    private String name;

    // * 10^24
    private double mass;

    private String location;

    @Override
    public String getOrbName() {
        return this.name;
    }

    @Override
    public OrbsPrototype clone() {
        Planet clonePlanet = new Planet();
        clonePlanet.setName(this.name);
        clonePlanet.setMass(this.mass);
        clonePlanet.setLocation(this.location);
        return clonePlanet;
    }
}