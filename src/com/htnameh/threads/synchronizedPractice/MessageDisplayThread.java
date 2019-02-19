package com.htnameh.threads.synchronizedPractice;

public class MessageDisplayThread implements Runnable {

    private Thread thread;
    private Message message;
    private String messageString;

    public MessageDisplayThread(Message message, String messageString) {
        this.message = message;
        this.messageString = messageString;

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        message.displayMsg(messageString);
    }
}
