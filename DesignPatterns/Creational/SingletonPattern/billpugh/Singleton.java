package DesignPatterns.Creational.SingletonPattern.billpugh;

/*
 * Bill Pugh Singleton Pattern
 *
 * Uses inner static helper class.
 */
public class Singleton {

    /*
     * Private constructor.
     */
    private Singleton() {}

    /*
     * Inner helper class.
     *
     * Loaded only when needed.
     */
    private static class SingletonHelper {

        private static final Singleton INSTANCE
                = new Singleton();
    }

    /*
     * Global access method.
     */
    public static Singleton getInstance() {

        return SingletonHelper.INSTANCE;
    }
}
