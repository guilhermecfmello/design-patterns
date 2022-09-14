package creation.abstractFactory;

public class SiameseFactory extends AbstractCatFactory {


    @Override
    public Cat createCat() {
        return CatFactory.createCat(ECat.Siamese);
    }
}
