package creation.builder.medias;

import lombok.Data;

@Data
public class Game {
    private String name;

    private String genre;

    private Integer hours;

    public boolean execute() {
        System.out.println("Loading " + this.name + ":");
        System.out.println("INFOS: \n\tname: " + this.name + "\n\tgenre: " + this.genre + "\n\thours: " + this.hours);
        System.out.println("Content loaded, enjoy it.");
        return true;
    }
}
