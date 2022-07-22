package creation.builder.streamming;

import creation.builder.medias.Movie;
import lombok.Setter;

public class YouTube {
    @Setter
    private Movie movie;

    public void play() {
        System.out.println("Starting movie in Netflix...");
        this.movie.start();
    }

}
