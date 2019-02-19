package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class SearchInABinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode root1Left = new TreeNode(2);
        TreeNode root1Right = new TreeNode(7);
        TreeNode root1_2Left = new TreeNode(1);
        TreeNode root1_2Right = new TreeNode(3);

        root.left = root1Left;
        root.right = root1Right;

        root1Left.left = root1_2Left;
        root1Left.right = root1_2Right;

        TreeNode result = searchBST(root, 2);

        System.out.println();
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val > root.val) {
            root = root.right;
        } else {
            root = root.left;
        }

        return searchBST(root, val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
