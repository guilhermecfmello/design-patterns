package creation.builder;

import creation.builder.hardware.Platform;

public interface PlayGameBuilder {

    public void selectGame();

    public void configurePlatform();

    public Platform getPlatform();
}
