package creation.singleton;

public class Main {
    public static void main(String[] args){
        var singleton = HeartSingleton.getInstance();

        singleton.beat();

    }
}
