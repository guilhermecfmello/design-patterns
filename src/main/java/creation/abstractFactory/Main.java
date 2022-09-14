package creation.abstractFactory;

public class Main {
    public static void main(String[] args) {
        SiameseFactory siameseFactory = new SiameseFactory();
        BurmeseFactory burmeseFactory = new BurmeseFactory();
        SomaliFactory somaliFactory = new SomaliFactory();

        Cat siameseCat = siameseFactory.createCat();
        Cat burmeseCat = burmeseFactory.createCat();
        Cat somaliCat = somaliFactory.createCat();

        siameseCat.simpleMeow();
        burmeseCat.simpleMeow();
        somaliCat.simpleMeow();
    }
}
