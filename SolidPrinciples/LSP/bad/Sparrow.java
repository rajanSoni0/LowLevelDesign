package SolidPrinciples.LSP.bad;

/*
 * Sparrow can fly normally.
 */
public class Sparrow extends Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
