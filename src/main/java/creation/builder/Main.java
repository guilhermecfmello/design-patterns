package creation.builder;

import creation.builder.hardware.Platform;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Platform platform;
        Director director;

        ArrayList<PlayGameBuilder> games = new ArrayList<>();
        games.add(new PlayCounterStrikeGoPcBuilder());
        games.add(new PlayDarkSoulsConsoleBuilder());

        for (PlayGameBuilder game:
             games) {
            director = new Director(game);
            director.playGame();
            director.getPlatform().start();
        }

    }
}
