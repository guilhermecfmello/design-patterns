package creation.builder.hardware;

import creation.builder.medias.Game;
import lombok.Data;

@Data
public class PC implements Platform {
    private String videoCard;

    private Game game;

    private boolean isDownloaded;

    public void download() {
        System.out.println("PC\n\tGame Downloaded.");
        this.isDownloaded = true;
    }

    public void start() {
        System.out.println("PC: Trying to start game");
        if( this.isDownloaded ) {
            System.out.println("\nGame already downloaded, loading game");
        }
        this.game.execute();
    }
}
