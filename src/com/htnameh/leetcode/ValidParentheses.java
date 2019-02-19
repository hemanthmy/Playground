package com.htnameh.leetcode;

import java.util.Stack;

/**
 * @author hemanth
 * @since 11/1/19
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid(""));
        System.out.println(isValid("(("));
        System.out.println(isValid("(()("));
        System.out.println(isValid("{{)}"));
    }

    private static boolean isValid(String input) {
        Stack<Character> bracesStack = new Stack<>();

        boolean result = false;

        if (input.length() == 0) {
            return true;
        }

        if (input.length() % 2 == 0) {
            for (int j = 0; j < input.length(); j++) {
                char charValue = input.charAt(j);

                if (charValue == '{' || charValue == '[' || charValue == '(') {
                    bracesStack.push(charValue);
                    result = false;
                } else if (charValue == '}') {
                    result = !bracesStack.isEmpty() && bracesStack.peek() == '{';
                    if (result) {
                        bracesStack.pop();
                    } else {
                        return false;
                    }
                } else if (charValue == ']') {
                    result = !bracesStack.isEmpty() && bracesStack.peek() == '[';
                    if (result) {
                        bracesStack.pop();
                    } else {
                        return false;
                    }
                } else if (charValue == ')') {
                    result = !bracesStack.isEmpty() && bracesStack.peek() == '(';
                    if (result) {
                        bracesStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return result && bracesStack.isEmpty();
    }
}
