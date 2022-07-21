package creation.factory;

public class Mutt extends Dog {

    public Mutt () {
        this.breed = "Mutt";
    }

    @Override
    public boolean barkYourBreed() {
        System.out.println("I'm a nice " + this.breed);
        return true;
    }

    @Override
    public boolean barkYourSize() {
        System.out.println("My size is a surprise baby");
        return false;
    }
}
