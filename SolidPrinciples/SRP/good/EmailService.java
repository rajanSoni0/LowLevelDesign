package SolidPrinciples.SRP.good;

/*
 * Responsibility:
 * Handles email-related operations only.
 * 
 * Reason to change:
 * If email provider or email logic changes.
 */
public class EmailService {

    // Simulates sending email notification
    public void sendEmail() {
        System.out.println("Sending email notification");
    }
}