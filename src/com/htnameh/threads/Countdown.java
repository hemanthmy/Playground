package com.htnameh.threads;

import com.htnameh.practice.ThreadColor;

public class Countdown {

    private int i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_YELLOW;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_RED;
                break;
            default:
                color = ThreadColor.ANSI_PURPLE;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " : i = " + i);
        }
    }
}
