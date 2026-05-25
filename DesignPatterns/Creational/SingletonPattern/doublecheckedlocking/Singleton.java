package DesignPatterns.Creational.SingletonPattern.doublecheckedlocking;

/*
 * Double Checked Locking Singleton
 *
 * Optimized thread-safe singleton.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        /*
         * First check avoids
         * unnecessary synchronization.
         */
        if(instance == null) {

            synchronized(Singleton.class) {

                /*
                 * Second check ensures
                 * object not already created.
                 */
                if(instance == null) {

                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
