package SolidPrinciples.OCP.good;

/*
 * Main class to test OCP.
 */
public class Main {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();

        payment.pay();
    }
}