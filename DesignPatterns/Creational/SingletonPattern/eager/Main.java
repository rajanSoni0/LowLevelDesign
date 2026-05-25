package DesignPatterns.Creational.SingletonPattern.eager;

public class Main {

    public static void main(String[] args) {

        Singleton obj1
                = Singleton.getInstance();

        Singleton obj2
                = Singleton.getInstance();

        /*
         * Both references point
         * to same object.
         */
        System.out.println(obj1);
        System.out.println(obj2);
    }
}