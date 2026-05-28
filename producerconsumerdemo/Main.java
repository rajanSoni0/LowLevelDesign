package producerconsumerdemo;

import producerconsumerdemo.buffer.Buffer;
import producerconsumerdemo.consumer.Consumer;
import producerconsumerdemo.producer.Producer;

public class Main {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer producer =
                new Producer(buffer);

        Consumer consumer =
                new Consumer(buffer);

        producer.start();

        consumer.start();
    }
}