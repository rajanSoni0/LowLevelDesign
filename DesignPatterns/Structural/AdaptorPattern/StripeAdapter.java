package DesignPatterns.Structural.AdaptorPattern;

/*
 * Adapter class.
 *
 * Converts StripeAPI interface
 * into PaymentProcessor interface.
 */
public class StripeAdapter
        implements PaymentProcessor {

    private StripeAPI stripeAPI;

    /*
     * Constructor injection.
     */
    public StripeAdapter(
            StripeAPI stripeAPI) {

        this.stripeAPI = stripeAPI;
    }

    /*
     * Converts pay() call
     * into makePayment().
     */
    @Override
    public void pay(int amount) {

        stripeAPI.makePayment(amount);
    }
}
