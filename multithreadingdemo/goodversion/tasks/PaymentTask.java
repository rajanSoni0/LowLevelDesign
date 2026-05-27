package multithreadingdemo.goodversion.tasks;

public class PaymentTask extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Processing Payment...");
            Thread.sleep(1000);
            System.out.println("Payment Processed");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}