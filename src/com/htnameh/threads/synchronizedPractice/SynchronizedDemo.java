package com.htnameh.threads.synchronizedPractice;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Message message = new Message();

        new MessageDisplayThread(message, "I");
        new MessageDisplayThread(message, "am");
        new MessageDisplayThread(message, "not");
        new MessageDisplayThread(message, "synchronized");
    }

}