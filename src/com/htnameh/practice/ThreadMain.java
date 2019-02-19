package com.htnameh.practice;

import static com.htnameh.practice.ThreadColor.*;

public class ThreadMain {

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread == ");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_RED + "Hello from anonymous class's implementation of run()")).start();

        Thread myRunnableThread = new Thread(() -> {
            System.out.println(ANSI_YELLOW + "Hello from my runnable thread");
            try {
                anotherThread.join(2000);
                System.out.println(ANSI_YELLOW + "Another thread terminated, or timed out, so I'm running again");
            } catch (InterruptedException e) {
                System.out.println(ANSI_YELLOW + "I couldn't wait after all. I was interrupted");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_BLUE + "Hello again from main thread");
    }
}
