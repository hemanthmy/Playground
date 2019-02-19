package com.htnameh.threads.synchronizedPractice;

public class Message {

    synchronized void displayMsg(String message) {
        System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
        System.out.print("**" + message);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**");
    }

}