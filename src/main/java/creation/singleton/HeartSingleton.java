package creation.singleton;

public class HeartSingleton {


    private static HeartSingleton heartSingleton;

    private HeartSingleton() {
    }

    public static HeartSingleton getInstance() {
        if(heartSingleton == null) {
            heartSingleton = new HeartSingleton();
        }
        return heartSingleton;
    }

    public void beat() {
        System.out.println("Tudum, tudum...");
    }
}
