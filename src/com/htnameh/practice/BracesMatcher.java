package com.htnameh.practice;

import java.util.Stack;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class BracesMatcher {

    public static void main(String[] args) {
        String[] inputArray = {"{[()]}", "{[][][]()}{}"};

        String[] result = braces(inputArray);

        for (String s : result) {
            System.out.println("Result : " + s);
        }
    }

    private static String[] braces(String[] inputArray) {
        String[] result = new String[inputArray.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = "YES";
        }

        Stack<Character> bracesStack = new Stack<>();

        for (int i = 0; i < inputArray.length; i++) {
            String input = inputArray[i];
            if (input.length() % 2 == 0) {
                for (int j = 0; j < input.length(); j++) {
                    char charValue = input.charAt(j);

                    if (charValue == '{' || charValue == '[' || charValue == '(') {
                        bracesStack.push(charValue);
                    } else if (charValue == '}') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '{') {
                            result[i] = "NO";
                            System.out.println("Failed 1");
                        }
                    } else if (charValue == ']') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '[') {
                            result[i] = "NO";
                            System.out.println("Failed 2");
                        }
                    } else if (charValue == ')') {
                        if (bracesStack.isEmpty() || bracesStack.pop() != '(') {
                            result[i] = "NO";
                            System.out.println("Failed 3");
                        }
                    }
                }
            } else {
                result[i] = "NO";
            }
        }

        return result;
    }
}
