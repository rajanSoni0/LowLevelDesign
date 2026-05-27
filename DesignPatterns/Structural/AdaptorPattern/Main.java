package DesignPatterns.Structural.AdaptorPattern;

public class Main {

    public static void main(String[] args) {

        /*
         * Third-party API object.
         */
        StripeAPI stripeAPI
                = new StripeAPI();

        /*
         * Adapter converts StripeAPI
         * into compatible interface.
         */
        PaymentProcessor processor
                = new StripeAdapter(stripeAPI);

        /*
         * Our application works normally.
         */
        PaymentService service
                = new PaymentService(processor);

        service.processPayment(5000);
    }
}
