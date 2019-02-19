package com.htnameh.practice;

import static com.htnameh.practice.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_PURPLE + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_PURPLE + "3 seconds have passed and I'm awake");
    }
}
