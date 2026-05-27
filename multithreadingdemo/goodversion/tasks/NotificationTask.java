package multithreadingdemo.goodversion.tasks;

public class NotificationTask extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Sending Notification...");
            Thread.sleep(1500);
            System.out.println("Notification Sent");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}