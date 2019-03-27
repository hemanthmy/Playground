package com.htnameh.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hemanth
 * @since 20/2/19
 */
public class BracesMatcher {

    public static void main(String[] args) {
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

}