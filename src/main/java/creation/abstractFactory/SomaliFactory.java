package creation.abstractFactory;

public class SomaliFactory extends AbstractCatFactory {


    @Override
    public Cat createCat() {
        return CatFactory.createCat(ECat.Somali);
    }
}
