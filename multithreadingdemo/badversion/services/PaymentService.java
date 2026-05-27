package multithreadingdemo.badversion.services;

public class PaymentService {

    public static void processPayment() throws InterruptedException {

        System.out.println("Processing Payment...");
        Thread.sleep(1000);
        System.out.println("Payment Processed");
    }
}