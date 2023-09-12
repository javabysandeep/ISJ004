package java8Features;

public class Singleton {
    private final static Singleton SINGLETON = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }
}
