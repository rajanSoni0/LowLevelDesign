package multithreadingdemo.badversion.services;

public class MailService {

    public static void sendMail() throws InterruptedException {

        System.out.println("Sending Mail...");
        Thread.sleep(3000);
        System.out.println("Mail Sent");
    }
}