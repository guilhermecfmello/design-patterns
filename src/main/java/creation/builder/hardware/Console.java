package creation.builder.hardware;

import creation.builder.medias.Game;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

public class Console {
    @Setter
    private UUID EAN;

    private Game disk;

    private boolean logged;

    public void insertDisc(Game disk) {
        this.disk = disk;
    }

    public void login(String user) {
        System.out.println("Console\n\tLogged in user: " + user);
        this.logged = true;
    }

    public void start() {
        System.out.println("Console: Trying to start game");
        if( this.logged ) {
            System.out.println("\nUser logged, loading game");
        }
        this.disk.execute();
    }

}
