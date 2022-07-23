package creation.builder;

import creation.builder.hardware.PC;
import creation.builder.hardware.Platform;
import creation.builder.medias.Game;

public class PlayCounterStrikeGoPcBuilder implements PlayGameBuilder {
    private Game game;

    private Platform platform;

    @Override
    public void selectGame() {
        Game cs = new Game();
        cs.setName("Counter Strike: Global Offensive");
        cs.setGenre("FPS");
        cs.setHours(99999);
        this.game = cs;
    }

    @Override
    public void configurePlatform() {
        PC pc = new PC();
        pc.setVideoCard("rx 470");
        pc.setGame(this.game);
        pc.download();
        this.platform = pc;
    }

    public Platform getPlatform() {
        return this.platform;
    }
}
