package creation.builder.hardware;

import creation.builder.medias.Game;
import lombok.Data;

import java.util.UUID;

@Data
public class Console implements Platform {

    private UUID EAN;

    private Game disk;

    private boolean logged;

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
