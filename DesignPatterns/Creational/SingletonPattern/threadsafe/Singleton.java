package DesignPatterns.Creational.SingletonPattern.threadsafe;

/*
 * Thread-safe Singleton Pattern
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    /*
     * synchronized ensures
     * only one thread enters method.
     */
    public static synchronized Singleton getInstance() {

        if(instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}
