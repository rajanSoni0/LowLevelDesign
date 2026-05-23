package SolidPrinciples.OCP.bad;

/*
 * BAD DESIGN:
 * Every time a new payment method is added,
 * this class must be modified.
 */
public class PaymentService {

    public void processPayment(String paymentType) {

        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment");
        }

        else if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI payment");
        }

        else if (paymentType.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment");
        }
    }
}