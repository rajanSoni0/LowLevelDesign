package DesignPatterns.Creational.BuilderPattern.bad;

public class Main {

    public static void main(String[] args) {

        /*
         * Constructor becomes messy
         * and difficult to read.
         */
        User user = new User(
                1,
                "Rajan",
                "rajan@gmail.com",
                22,
                "Delhi",
                "9999999999"
        );

        user.display();
    }
}
