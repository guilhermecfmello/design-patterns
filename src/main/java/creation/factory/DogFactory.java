package creation.factory;

public class DogFactory {

    public static Dog createDog(EDog breed) {
        Dog dog = switch (breed) {
            case Poodle -> new Poodle();
            case Pinscher -> new Pinscher();
            case Mutt -> new Mutt();
        };

        return dog;
    }
}
