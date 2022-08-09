package creation.factory;


import lombok.Data;

@Data
public abstract class Dog {
    protected String breed;

    protected String size;

    public void simpleBark() {
        System.out.println("Au au!");
    }

    public boolean poop(){
        System.out.println("Pooping in your couch...");
        return true;
    }

    public abstract boolean barkYourBreed();

    public abstract boolean barkYourSize();
}
