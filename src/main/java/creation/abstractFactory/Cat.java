package creation.abstractFactory;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Cat {
    @NonNull
    private String breed;

    public void simpleMeow() {
        System.out.println("Meow, I'm a " + this.breed);
    }

    public boolean toPurr(){
        System.out.println("Purrrrrrrrrrr...");
        return true;
    }

}
