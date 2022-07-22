package creation.builder.hardware;

import creation.builder.medias.Game;
import lombok.Setter;

public class PC {
    @Setter
    private String videoCard;

    @Setter
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
