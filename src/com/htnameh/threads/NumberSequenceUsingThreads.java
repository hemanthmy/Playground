package com.htnameh.threads;

public class NumberSequenceUsingThreads {

    public static void main(String[] args) {
        NumberSequenceLock counter = new NumberSequenceLock();

        Thread evenThread = new Thread(() -> {
            synchronized (counter) {
                for (int i = 0; i <= 10; i = i + 2) {
                    if (!counter.isEven()) {
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(i);
                    counter.setEven(false);
                    counter.notify();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized (counter) {
                for (int i = 1; i < 10; i = i + 2) {
                    if (counter.isEven()) {
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(i);
                    counter.setEven(true);
                    counter.notify();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}