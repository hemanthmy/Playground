package com.htnameh.threads.producerConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class ProducerConsumerWaitNotify {

    public static void main(String[] args) {
        List<Integer> sharedQueue = new ArrayList<>();

        MyProducer myProducer = new MyProducer(sharedQueue);
        MyConsumer myConsumer = new MyConsumer(sharedQueue);

        Thread producerThread = new Thread(myProducer);
        Thread consumerThread = new Thread(myConsumer);

        producerThread.start();
        consumerThread.start();
    }

}