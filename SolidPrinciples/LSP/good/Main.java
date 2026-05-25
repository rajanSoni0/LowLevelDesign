package SolidPrinciples.LSP.good;

/*
 * Main class to test proper LSP design.
 */
public class Main {

    public static void makeBirdFly(Flyable bird) {

        bird.fly();
    }

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();

        makeBirdFly(sparrow);

        Ostrich ostrich = new Ostrich();

        ostrich.eat();
    }
}
