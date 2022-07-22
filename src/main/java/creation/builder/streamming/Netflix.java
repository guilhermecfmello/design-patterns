package creation.builder.streamming;

import creation.builder.medias.Movie;
import lombok.Setter;

public class Netflix {
    @Setter
    private Movie movie;

    private String user;

    public void login(String user) {
        this.user = user;
    }

    public void play() {
        if( !this.user.isEmpty() ) {
            System.out.println("Starting movie in Netflix...");
            this.movie.start();
        }
    }

}
