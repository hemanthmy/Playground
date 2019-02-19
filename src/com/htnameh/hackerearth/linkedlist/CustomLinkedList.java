package com.htnameh.hackerearth.linkedlist;

/**
 * @author hemanth
 * @since 27/12/18
 */
public class CustomLinkedList {

    private Node first = null;
    private Node last = null;
    public int size = 1;

    public Node nextNode(Node currentNode) throws NullPointerException {
        if (currentNode.next == null) {
            throw new NullPointerException();
        } else {
            return currentNode.next;
        }
    }

    public Node prevNode(Node currentNode) throws NullPointerException {
        if (currentNode.prev == null) {
            throw new NullPointerException();
        } else {
            return currentNode.prev;
        }
    }

    public Node add(int data) {
        size++;
        if (first == null) {
            first = new Node(data, null, null);
            last = first;
            return first;
        } else {
            Node newNode = new Node(data, null, last);
            last.next = newNode;
            last = newNode;
            return newNode;
        }
    }

    public boolean remove(int index) throws NullPointerException {
        if (first == null) {
            throw new NullPointerException();
        } else {
            Node node = get(index);
            Node next = node.next;
            Node prev = node.prev;

            if (prev != null) {
                prev.next = next;
            } else {
                first = next;
                first.prev = null;
            }

            if (next != null) {
                next.prev = prev;
            } else {
                last = prev;
                last.next = null;
            }

            size--;

            return true;
        }
    }

    public Node get(int index) {
        if (index > size) {
            return null;
        }
        Node node = getHead();
        while (index != 0) {
            node = node.next;
            index--;
        }

        return node;
    }

    public int peek() {
        final Node f = first;
        return (f == null) ? 0 : f.popularity;
    }

    public Node getHead() {
        return first;
    }

    public void asString() {
        Node node = first;
        while (node != null) {
            node.asString();
            node = node.next;
        }
    }
}
