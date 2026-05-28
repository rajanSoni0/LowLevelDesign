package producerconsumerdemo.buffer;


public class Buffer {

    private int data;

    private boolean available = false;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (available) {

            wait();
        }

        data = value;

        available = true;

        System.out.println(
                "Produced: " + value
        );

        notify();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (!available) {

            wait();
        }

        System.out.println(
                "Consumed: " + data
        );

        available = false;

        notify();
    }
}
