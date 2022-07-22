package creation.builder.medias;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Game {
    @NonNull
    private String name;

    @NonNull
    private String genre;

    @NonNull
    private Integer hours;

    public boolean execute() {
        System.out.println("Loading " + this.name + ":");
        System.out.println("INFOS: \n\tname: " + this.name + "\n\tgenre: " + this.genre + "\n\thours: " + this.hours);
        System.out.println("Content loaded, enjoy it.");
        return true;
    }
}
