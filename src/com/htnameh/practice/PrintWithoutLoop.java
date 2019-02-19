package com.htnameh.practice;

import java.util.PriorityQueue;

/**
 * @author hemanth
 * @since 7/2/19
 */
public class PrintWithoutLoop {

    public static void main(String[] args) {
        printWithoutLoop("abc");

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    }

    private static void printWithoutLoop(String input) {
        String str = "X";
        str = str.replaceAll("X", "XXXXXXXXX");
        str = str.replaceAll("X", "XXXXXXXXX");
        str = str.replaceAll("X", input + " ");

        System.out.println(str);
    }

}