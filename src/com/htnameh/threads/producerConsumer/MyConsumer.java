package com.htnameh.threads.producerConsumer;

import java.util.List;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MyConsumer implements Runnable {

    private List<Integer> sharedQueue;

    public MyConsumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        //if sharedQueue is empty wait until producer produces.
        synchronized (sharedQueue) {
            while (sharedQueue.size() == 0) {
                System.out.println("Queue is empty, consumerThread is waiting for "
                        + "producerThread to produce, sharedQueue's size = 0");
                sharedQueue.wait();
            }
        }

        /* 2 Synchronized blocks have been used means before
         * consumer start consuming by entering below synchronized
         * block producer can produce.
         */

        /*If sharedQueue not empty consumer will consume
         * (by removing from sharedQueue) and notify the producerThread.
         */
        synchronized (sharedQueue) {
            Thread.sleep((long) (Math.random() * 2000));
            System.out.println("Consumed product - " + sharedQueue.remove(0));
            sharedQueue.notify();
        }
    }

}