package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 28/1/19
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {
        Node root1 = insert(null, 5);
        insert(root1, 3);
        insert(root1, 8);
        insert(root1, 2);
        insert(root1, 4);
        insert(root1, 6);
        insert(root1, 7);

        Node root2 = insert(null, 1);
        insert(root2, 2);

        Node result1 = lca(root1, 7, 3);
        Node result2 = lca(root2, 1, 2);

        System.out.println(result1.data);
        System.out.println(result2.data);
    }

    private static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }

        if (v1 == root.data || v2 == root.data) {
            return root;
        }
        if (v1 < root.data && v2 > root.data
                || v1 > root.data && v2 < root.data) {
            return root;
        }
        if (v1 > root.data) {
            return lca(root.right, v1, v2);
        } else {
            return lca(root.left, v1, v2);
        }
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
