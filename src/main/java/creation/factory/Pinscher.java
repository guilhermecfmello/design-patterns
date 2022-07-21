package creation.factory;

import lombok.NonNull;

public class Pinscher extends Dog {


    public Pinscher() {
        this.breed = "Pinscher";
        this.size = "10";
    }

    @Override
    public boolean barkYourBreed() {
        System.out.println("I'm a bad " + this.breed);
        return true;
    }

    @Override
    public boolean barkYourSize() {
        System.out.println("I'm " + this.size + " centimeters of pure evil and trembling");
        return true;
    }

    @Override
    public boolean poop() {
        System.out.println("I cannot poop, I'm trembling");
        return false;
    }
}

