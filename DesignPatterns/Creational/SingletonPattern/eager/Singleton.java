package DesignPatterns.Creational.SingletonPattern.eager;

/*
 * Eager Loading Singleton Pattern
 *
 * Object is created immediately
 * when class loads.
 */
public class Singleton {

    /*
     * Static instance created eagerly.
     */
    private static final Singleton instance
            = new Singleton();

    /*
     * Private constructor prevents
     * external object creation.
     */
    private Singleton() {

        System.out.println(
                "Singleton instance created"
        );
    }

    /*
     * Global access method.
     */
    public static Singleton getInstance() {

        return instance;
    }
}