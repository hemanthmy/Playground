package com.htnameh.threads.producerConsumer;

import java.util.List;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MyProducer implements Runnable {

    private List<Integer> sharedQueue;
    private int MAX_SIZE = 2;

    public MyProducer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int i) throws InterruptedException {
        //if sharedQueue is full wait until consumer consumes.
        synchronized (sharedQueue) {
            while (sharedQueue.size() == MAX_SIZE) {
                System.out.println("Queue is full, producerThread is waiting for "
                        + "consumerThread to consume, sharedQueue's size = " + MAX_SIZE);
                sharedQueue.wait();
            }
        }

        /* 2 Synchronized blocks have been used means before
         * producer produces by entering below synchronized
         * block consumer can consume.
         */

        //as soon as producer produces (by adding in sharedQueue) it notifies consumerThread.
        synchronized (sharedQueue) {
            System.out.println("Produced product - " + i);
            sharedQueue.add(i);
            Thread.sleep((long) (Math.random() * 1000));
            sharedQueue.notify();
        }
    }

}