package SolidPrinciples.ISP.bad;

/*
 * BAD DESIGN:
 * Huge interface forcing unnecessary methods.
 */
public interface Worker {

    void work();

    void eat();
}
