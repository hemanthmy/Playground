package com.htnameh.treeds;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class Node {

    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}