package DesignPatterns.Structural.AdaptorPattern;

/*
 * Third-party Stripe API.
 *
 * Incompatible with our system.
 */
public class StripeAPI {

    public void makePayment(int money) {

        System.out.println(
                "Payment processed using Stripe: "
                + money
        );
    }
}