package creation.builder.medias;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Movie {

    @NonNull
    private String name;

    @NonNull
    private String genre;

    @NonNull
    private Integer hours;

    @NonNull
    private float rating;

    public void start() {
        System.out.println("Starting movie");
        System.out.println("INFOS:");
        System.out.println("\nname: " + this.name);
        System.out.println("\ngenre: " + this.genre);
        System.out.println("\nhours: " + this.hours);
        System.out.println("\nrating: " + this.rating);
    }

}
