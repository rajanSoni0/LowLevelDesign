package SolidPrinciples.OCP.bad;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment("UPI");
    }
}