package creation.abstractFactory;

public class BurmeseFactory extends AbstractCatFactory {

    @Override
    public Cat createCat() {
        return CatFactory.createCat(ECat.Burmese);
    }
}
