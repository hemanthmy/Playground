package com.htnameh.practice;

import javafx.util.Pair;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author hemanth
 * @since 26/2/19
 */
public class MinStack {

    private Stack<Pair<Integer, Integer>> stack;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(11);
        minStack.push(3);
        minStack.push(14);
        minStack.push(2);
        minStack.push(1);
        minStack.push(-1);
        minStack.push(8);
        minStack.push(6);

        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        System.out.println(minStack.min());
    }

    private MinStack() {
        this.stack = new Stack<>();
    }

    private void push(int data) {
        int newMin = stack.isEmpty() ? data : Math.min(data, stack.peek().getValue());
        stack.push(new Pair<>(data, newMin));
    }

    private int pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack.pop().getKey();
        }
    }

    private int min() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack.peek().getValue();
        }
    }

}