package producerconsumerdemo.producer;

import producerconsumerdemo.buffer.Buffer;

public class Producer extends Thread {

    private Buffer buffer;

    public Producer(Buffer buffer) {

        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                buffer.produce(i);

                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
