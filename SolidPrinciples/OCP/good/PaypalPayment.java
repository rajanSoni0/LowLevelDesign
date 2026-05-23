package SolidPrinciples.OCP.good;

/*
 * Handles PayPal payment.
 */
public class PaypalPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing PayPal payment");
    }
}