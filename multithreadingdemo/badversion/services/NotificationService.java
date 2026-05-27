package multithreadingdemo.badversion.services;

public class NotificationService {

    public static void sendNotification() throws InterruptedException {

        System.out.println("Sending Notification...");
        Thread.sleep(1500);
        System.out.println("Notification Sent");
    }
}