package com.htnameh.practice;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MinQueue {

    private ArrayDeque<Integer> integerQueue;

    public static void main(String[] args) {

    }

    public MinQueue() {
        this.integerQueue = new ArrayDeque<>();
    }

    private void push(int data) {
        while (!integerQueue.isEmpty() && integerQueue.peek() > data) {
            integerQueue.poll();
        }
        integerQueue.add(data);
    }



}