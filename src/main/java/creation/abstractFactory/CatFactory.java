package creation.abstractFactory;

public class CatFactory {

    public static Cat createCat(ECat breed) {
        Cat cat = switch (breed) {
            case Siamese -> new Siamese();
            case Somali -> new Somali();
            case Burmese -> new Burmese();
        };

        return cat;
    }

}
