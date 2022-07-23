package creation.builder;

import creation.builder.hardware.Platform;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Director {

    private final PlayGameBuilder builder;

    public void playGame() {
        this.builder.selectGame();
        this.builder.configurePlatform();
    }

    public Platform getPlatform() {
        return this.builder.getPlatform();
    }
}
