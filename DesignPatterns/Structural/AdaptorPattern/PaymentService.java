package DesignPatterns.Structural.AdaptorPattern;

/*
 * Service class depends only
 * on PaymentProcessor abstraction.
 */
public class PaymentService {

    private PaymentProcessor processor;

    public PaymentService(
            PaymentProcessor processor) {

        this.processor = processor;
    }

    public void processPayment(int amount) {

        processor.pay(amount);
    }
}
