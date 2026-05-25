package DesignPatterns.Creational.SingletonPattern.lazy;

/*
 * Lazy Loading Singleton Pattern
 *
 * Object created only when needed.
 */
public class Singleton {

    /*
     * Initially no object created.
     */
    private static Singleton instance;

    /*
     * Private constructor.
     */
    private Singleton() {

        System.out.println(
                "Singleton instance created"
        );
    }

    /*
     * Object created lazily.
     */
    public static Singleton getInstance() {

        if(instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}
