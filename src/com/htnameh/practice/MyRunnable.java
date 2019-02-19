package com.htnameh.practice;

import static com.htnameh.practice.ThreadColor.ANSI_YELLOW;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_YELLOW + "Hello from my runnable thread");
    }
}