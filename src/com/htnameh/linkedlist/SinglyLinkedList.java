package com.htnameh.linkedlist;

/**
 * @author hemanth
 * @since 13/2/19
 */
public class SinglyLinkedList {

    // head of list
    private Node head;

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.append(8);
        singlyLinkedList.push(5);
        singlyLinkedList.push(1);
        singlyLinkedList.push(9);
        singlyLinkedList.insertAfter(singlyLinkedList.head.next, 6);
        singlyLinkedList.append(2);
        singlyLinkedList.push(4);
        singlyLinkedList.push(3);
        singlyLinkedList.insertAfter(singlyLinkedList.head.next, 7);

        singlyLinkedList.printList();

        singlyLinkedList.deleteNode(4);
        singlyLinkedList.deleteNode(3);

        singlyLinkedList.printList();

        System.out.println("Middle node in the list " + singlyLinkedList.findMiddle());

        System.out.println("Size " + singlyLinkedList.size());

//        singlyLinkedList.head.next.next.next.next = singlyLinkedList.head;

        System.out.println("Does loop exists? " + singlyLinkedList.detectLoop());

        System.out.println("Number of nodes in the loop " + singlyLinkedList.countNodesInLoop());

        singlyLinkedList.printList();

        singlyLinkedList.reverse();

        System.out.println("Reversed list");
        singlyLinkedList.printList();

        singlyLinkedList.head = singlyLinkedList.reverseRecursively(singlyLinkedList.head);

        System.out.println("Reversed list");
        singlyLinkedList.printList();

        Node nodeToDelete = singlyLinkedList.search(singlyLinkedList.head, 2);

        System.out.println("Deleting node " + nodeToDelete.data);
        singlyLinkedList.deleteNode(nodeToDelete);

        System.out.println("List after deleting node");
        singlyLinkedList.printList();

        System.out.println("====================");

        System.out.println("Swapping two nodes");

        singlyLinkedList.swapNodes(1, 8);

        System.out.println("List after swapping");
        singlyLinkedList.printList();

        singlyLinkedList.swapNodes(7, 2);

        System.out.println("List after swapping");
        singlyLinkedList.printList();
    }

    /**
     * Inserts a new Node at front of the list
     *
     * @param data data of new node
     */
    private void push(int data) {
        // Allocate new node with given data
        Node node = new Node(data);

        // Make next pointer of new node as head
        node.next = head;

        // Change head pointer to point to new node
        head = node;
    }

    /**
     * Appends the new node at the end of the list
     *
     * @param data Data value of the new node
     */
    private void append(int data) {
        // Allocate the new node with the data
        Node node = new Node(data);

        // if linked list is empty, then make the new node as the head
        if (head == null) {
            head = new Node(data);
            return;
        }

        // Make new node's next as null as it will be the last node
        node.next = null;

        // Traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Change the next of existing last node to new node
        last.next = node;
    }

    /**
     * Inserts a new node after the given prev_node
     *
     * @param prevNode Node which will be assigned as previous node to the new node
     * @param data     Data of the new node
     */
    private void insertAfter(Node prevNode, int data) {
        // Check if given previous node is null
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        // Allocate new node with given data
        Node newNode = new Node(data);

        // Make next of newNode as next of prevNode
        newNode.next = prevNode.next;

        // Make next of prevNode as newNode
        prevNode.next = newNode;
    }

    private Node search(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (node.data == key) {
            return node;
        }

        return search(node.next, key);
    }

    /**
     * If exists then deletes the node of the given key
     *
     * @param key data value to be deleted
     */
    private void deleteNode(int key) {
        // Store head node
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /**
     * Deletes the given node
     *
     * @param node Node to be deleted
     */
    private void deleteNode(Node node) {
        Node temp = node.next;

        if (temp != null) {
            node.data = temp.data;
            node.next = temp.next;
        }
    }

    /**
     * Deletes all nodes in the list. Basically sets head node to null
     */
    private void deleteAll() {
        head = null;
    }

    /**
     * Reverses the order of items in the list iteratively
     */
    private void reverse() {
        if (head == null) {
            return;
        }

        Node next;
        Node prev = null;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    /**
     * Reverses the order of items in the list recursively
     */
    private Node reverseRecursively(Node node) {
        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return node;
        }

        Node newNode = reverseRecursively(node.next);

        node.next.next = node;
        node.next = null;

        return newNode;
    }

    /**
     * Finds the middle node in the list
     *
     * @return Returns the data of middle node if exists else returns -1
     */
    private int findMiddle() {
        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    /**
     * Swaps nodes without swapping data for the given keys
     */
    private void swapNodes(int keyX, int keyY) {
        if (head == null) {
            return;
        }

        Node prevX = null;
        Node prevY = null;
        Node keyNodeX = head;
        Node keyNodeY = head;

        while (keyNodeX != null) {
            if (keyNodeX.data == keyX) {
                break;
            }
            prevX = keyNodeX;
            keyNodeX = keyNodeX.next;
        }

        while (keyNodeY != null) {
            if (keyNodeY.data == keyY) {
                break;
            }
            prevY = keyNodeY;
            keyNodeY = keyNodeY.next;
        }

        if (keyNodeX == null || keyNodeY == null) {
            System.out.println("Key not found");
            return;
        }

        if (keyNodeX == keyNodeY) {
            System.out.println("No need to swap as both nodes are same");
            return;
        }

        if (prevX != null) {
            prevX.next = keyNodeY;
        } else {
            head = keyNodeY;
        }

        if (prevY != null) {
            prevY.next = keyNodeX;
        } else {
            head = keyNodeX;
        }

        Node temp = keyNodeX.next;
        keyNodeX.next = keyNodeY.next;
        keyNodeY.next = temp;
    }

    /**
     * Detects loop in the loop if exists
     *
     * @return true if loop exists else false
     */
    private boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    /**
     * Counts the number of nodes in loop if loop exists
     *
     * @return number of nodes in loop if exists else returns 0
     */
    private int countNodesInLoop() {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int result = 1;
                Node temp = slow;

                while (temp.next != slow) {
                    result++;
                    temp = temp.next;
                }

                return result;
            }
        }

        return 0;
    }

    /**
     * Calculates the size of list recursively
     *
     * @return Size of the list
     */
    private int size() {
        return getSize(head);
    }

    /**
     * Recursive function to find the length
     *
     * @param node Head of list
     * @return Size of the list
     */
    private int getSize(Node node) {
        // Base case
        if (node == null) {
            return 0;
        }

        // Count is this node plus rest of the list
        return 1 + getSize(node.next);
    }

    /**
     * Prints data of whole list
     */
    private void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }

    /**
     * Prints data in the list from the given node
     *
     * @param node Node to start printing
     */
    private void printNodes(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }

    /* Node Class */
    class Node {

        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }

    }
}