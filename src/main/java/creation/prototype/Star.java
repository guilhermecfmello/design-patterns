package creation.prototype;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements OrbsPrototype {
    private String name;

    // * 10^24
    private double mass;

    private double temperature;

    @Override
    public OrbsPrototype clone() {
        Star cloneStar = new Star();
        cloneStar.setName(this.name);
        cloneStar.setMass(this.mass);
        cloneStar.setTemperature(this.temperature);

        return cloneStar;
    }

    @Override
    public String getOrbName() {
        return this.name;
    }

}