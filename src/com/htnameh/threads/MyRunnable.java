package com.htnameh.threads;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("In run() method");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
        }
    }

}