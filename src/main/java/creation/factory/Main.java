package creation.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting dog Factory...");
        List<EDog> dogsToBuild = new ArrayList<>();
        List<Dog> aliveDogs = new ArrayList<>();

        dogsToBuild.add(EDog.Poodle);
        dogsToBuild.add(EDog.Pinscher);
        dogsToBuild.add(EDog.Mutt);

        for (EDog breed:dogsToBuild) {
            aliveDogs.add(DogFactory.createDog(breed));
        }

        for (Dog dog: aliveDogs) {
            dog.barkYourBreed();
            dog.barkYourSize();
            dog.poop();
            System.out.println("========================");
        }
    }
}
