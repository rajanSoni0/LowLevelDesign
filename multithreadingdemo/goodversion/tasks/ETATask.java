package multithreadingdemo.goodversion.tasks;

public class ETATask extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Calculating ETA...");
            Thread.sleep(2000);
            System.out.println("ETA Calculated");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}