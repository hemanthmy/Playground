package com.htnameh.treeds;

import java.util.Stack;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("PreOrder traversal of binary tree using recursion ");
        tree.printPreOrder();

        System.out.println("\nInOrder traversal of binary tree using recursion ");
        tree.printInOrder();

        System.out.println("\nPostOrder traversal of binary tree using recursion ");
        tree.printPostOrder();
    }

    private Node create(int data) {
        Node node = new Node(data);
        node.left = null;
        node.right = null;
        return node;
    }

    private void insert(int data) {
        if (root == null) {
            root = create(data);
        } else {
            Node node = create(data);

            while (true) {
                if (node.key < root.key) {
                    if (root.left == null) {
                        root.left = node;
                        break;
                    }
                    root = root.right;
                }
                if (node.key > root.key) {
                    if (root.right == null) {
                        root.right = node;
                        break;
                    }
                    root = root.left;
                }
            }
        }
    }

    private void printPreOrder() {
        printPreOrder(root);
        System.out.println("\nPreOrder traversal of binary tree using iteration ");
        printPreOrderWithIteration(root);
    }

    private void printInOrder() {
        printInOrder(root);
        System.out.println("\nInOrder traversal of binary tree using iteration ");
        printInOrderWithIteration(root);
    }

    private void printPostOrder() {
        printPostOrder(root);
        System.out.println("\nPostOrder traversal of binary tree using iteration ");
        printPostOrderWithIteration(root);
    }

    private void printPreOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private void printPreOrderWithIteration(Node node) {
        Stack<Node> stack = new Stack<>();

        if (node != null) {
            stack.push(node);
        } else {
            return;
        }

        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            System.out.print(pop.key + " ");
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printPreOrder(node.left);
        System.out.print(node.key + " ");
        printPreOrder(node.right);
    }

    private void printInOrderWithIteration(Node node) {
        Stack<Node> stack = new Stack<>();

        if (node != null) {
            stack.push(node);
        } else {
            return;
        }

        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }
            System.out.print(pop.key + " ");
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    private void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        printPreOrder(node.left);
        printPreOrder(node.right);
        System.out.print(node.key + " ");
    }

    private void printPostOrderWithIteration(Node node) {
        Stack<Node> stack = new Stack<>();

        if (node != null) {
            stack.push(node);
        } else {
            return;
        }

        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
            System.out.print(pop.key + " ");
        }
    }

}
