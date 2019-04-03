package com.htnameh.practice;

/**
 * @author hemanth
 * @since 22/2/19
 */
public class Misc {

    public static void main(String[] args) {
        doSomeStuff();
    }

    private static void doSomeStuff() {
        StringIterable stringIterable = new StringIterable("abcd");

        for (Character character : stringIterable) {
            System.out.println(character);
        }
    }

}