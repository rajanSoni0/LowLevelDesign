package SolidPrinciples.OCP.good;

/*
 * Handles UPI payment.
 */
public class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing UPI payment");
    }
}