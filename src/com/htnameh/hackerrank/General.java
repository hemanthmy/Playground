package com.htnameh.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hemanth
 * @since 20/2/19
 */
public class General {

    public static void main(String[] args) {
//        bracesMatcher();
//        palindrome();
//        splitter();
    }

    private static void bracesMatcher() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Stack<Character> bracesStack = new Stack<>();

            boolean result = true;

            if (input.length() % 2 == 0) {
                for (int j = 0; j < input.length(); j++) {
                    char charValue = input.charAt(j);

                    if (charValue == '{' || charValue == '[' || charValue == '(') {
                        bracesStack.push(charValue);
                    } else if (charValue == '}') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '{') {
                            result = false;
                            break;
                        }
                    } else if (charValue == ']') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '[') {
                            result = false;
                            break;
                        }
                    } else if (charValue == ')') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '(') {
                            result = false;
                            break;
                        }
                    }
                }
            } else {
                result = false;
            }

            System.out.println(result);
        }
    }

    private static void palindrome() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String result = "Yes";

        for (int start = 0, end = A.length() - 1; start <= end; start++, end--) {
            if (A.charAt(start) != A.charAt(end)) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }

    private static void splitter() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] result = s.split("[^a-zA-Z]");

        for (String str : result) {
            if (!str.isEmpty()) {
                System.out.println(str.trim());
            }
        }

        scan.close();
    }

}