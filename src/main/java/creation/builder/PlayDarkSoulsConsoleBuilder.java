package creation.builder;

import creation.builder.hardware.Console;
import creation.builder.medias.Game;

import java.util.UUID;

public class PlayDarkSoulsConsoleBuilder implements PlayGameBuilder {
    private Game game;

    private Console console;

    @Override
    public void selectGame() {
        Game darkSouls = new Game();
        darkSouls.setName("Dark Soul 1: Prepare to die Edition");
        darkSouls.setGenre("Soul's like");
        darkSouls.setHours(60);
        this.game = darkSouls;
    }

    @Override
    public void configurePlatform() {
        Console ps4 = new Console();
        ps4.setEAN(UUID.randomUUID());
        ps4.setDisk(this.game);
        ps4.login("User default");
        this.console = ps4;
    }

    public Console getPlatform() {
        return this.console;
    }
}
