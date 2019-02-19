package com.htnameh.leetcode;

import java.util.Stack;

/**
 * @author hemanth
 * @since 14/2/19
 */
public class ReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                switch (token) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        Integer pop = stack.pop();
                        stack.push(stack.pop() - pop);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        Integer pop1 = stack.pop();
                        stack.push(stack.pop() / pop1);
                        break;
                }
            }
        }

        return stack.pop();
    }

}