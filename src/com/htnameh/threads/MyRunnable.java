package com.htnameh.threads.synchronizedPractice;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("in run() method");
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
        }
    }

}