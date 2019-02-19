package com.htnameh.practice;

import java.util.Scanner;

public class JavaEOF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (scanner.hasNextLine()) {
            System.out.println(++counter + " " + scanner.nextLine());
        }
    }
}
