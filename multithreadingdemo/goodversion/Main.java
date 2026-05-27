package multithreadingdemo.goodversion;

import multithreadingdemo.goodversion.tasks.ETATask;
import multithreadingdemo.goodversion.tasks.NotificationTask;
import multithreadingdemo.goodversion.tasks.PaymentTask;
import multithreadingdemo.goodversion.tasks.SendMailTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        SendMailTask mailTask = new SendMailTask();
        ETATask etaTask = new ETATask();
        PaymentTask paymentTask = new PaymentTask();
        NotificationTask notificationTask = new NotificationTask();

        System.out.println("Starting Multithreading Tasks...\n");

        mailTask.start();
        etaTask.start();
        paymentTask.start();
        notificationTask.start();

        mailTask.join();
        etaTask.join();
        paymentTask.join();
        notificationTask.join();

        long end = System.currentTimeMillis();

        System.out.println("\nAll tasks completed");
        System.out.println("Total Time: " + (end - start) + " ms");
    }
}