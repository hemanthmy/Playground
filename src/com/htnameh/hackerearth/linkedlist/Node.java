package com.htnameh.hackerearth.linkedlist;

/**
 * @author hemanth
 * @since 27/12/18
 */
public class Node {

    public int popularity;
    public Node next;
    public Node prev;

    public Node() {
    }

    public Node(int popularity, Node next) {
        this.popularity = popularity;
        this.next = next;
    }

    public Node(int popularity, Node next, Node prev) {
        this.popularity = popularity;
        this.next = next;
        this.prev = prev;
    }

    public void asString() {
        System.out.print(popularity + " ");
    }

}