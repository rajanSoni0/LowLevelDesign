package multithreadingdemo.badversion.services;

public class ETAService {

    public static void calculateETA() throws InterruptedException {

        System.out.println("Calculating ETA...");
        Thread.sleep(2000);
        System.out.println("ETA Calculated");
    }
}