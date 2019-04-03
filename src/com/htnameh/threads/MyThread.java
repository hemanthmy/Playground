package com.htnameh.threads;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MyThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("In main() method");

        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread1.join(1000);

        thread2.start();
        thread2.join();

        System.out.println("End of main() method");
    }
}
