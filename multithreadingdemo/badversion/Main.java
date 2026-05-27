package multithreadingdemo.badversion;

import multithreadingdemo.badversion.services.ETAService;
import multithreadingdemo.badversion.services.MailService;
import multithreadingdemo.badversion.services.NotificationService;
import multithreadingdemo.badversion.services.PaymentService;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        System.out.println("Starting Sequential Tasks...\n");

        MailService.sendMail();
        ETAService.calculateETA();
        PaymentService.processPayment();
        NotificationService.sendNotification();

        long end = System.currentTimeMillis();

        System.out.println("\nAll tasks completed");
        System.out.println("Total Time: " + (end - start) + " ms");
    }
}