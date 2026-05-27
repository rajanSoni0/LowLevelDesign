package DesignPatterns.Structural.AdaptorPattern;

/*
 * Target interface expected
 * by our application.
 */
public interface PaymentProcessor {

    void pay(int amount);
}
