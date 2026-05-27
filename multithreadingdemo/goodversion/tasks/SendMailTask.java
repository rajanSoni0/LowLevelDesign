package multithreadingdemo.goodversion.tasks;

public class SendMailTask extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Sending Mail...");
            Thread.sleep(3000);
            System.out.println("Mail Sent");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}