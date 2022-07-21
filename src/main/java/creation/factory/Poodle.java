package creation.factory;

import lombok.NonNull;

public class Poodle extends Dog {


    public Poodle() {
        this.breed = "Poodle";
        this.size = "38";
    }


    @Override
    public boolean barkYourBreed() {
        System.out.println("I'm a cute " + this.breed + " auf");
        return true;
    }

    @Override
    public boolean barkYourSize() {
        System.out.println("I'm " + this.size + " centimeters tall");
        return true;
    }
}
