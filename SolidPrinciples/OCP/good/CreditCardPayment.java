package SolidPrinciples.OCP.good;

/*
 * Handles credit card payment.
 */
public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing credit card payment");
    }
}