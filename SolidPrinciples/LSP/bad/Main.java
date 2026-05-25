package SolidPrinciples.LSP.bad;

/*
 * Main class to test LSP violation.
 */
public class Main {

    public static void makeBirdFly(Bird bird) {

        // Expectation:
        // every Bird should fly safely
        bird.fly();
    }

    public static void main(String[] args) {

        Bird sparrow = new Sparrow();

        Bird ostrich = new Ostrich();

        makeBirdFly(sparrow);

        // Runtime problem
        makeBirdFly(ostrich);
    }
}
