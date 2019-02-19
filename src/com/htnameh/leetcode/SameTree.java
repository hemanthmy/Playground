package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 23/1/19
 */
public class SameTree {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root1Left = new TreeNode(2);
        TreeNode root1Right = new TreeNode(3);

        root1.left = root1Left;
        root1.right = root1Right;

        TreeNode root2 = new TreeNode(1);
        TreeNode root2Left = new TreeNode(2);
        TreeNode root2Right = new TreeNode(3);
        TreeNode root21Right = new TreeNode(3);

        root2.left = root2Left;
        root2.right = root2Right;
//        root2Right.right = root21Right;

        System.out.println(isSameTree(root1, root2));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result;

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        result = isSameTree(p.left, q.left);

        if (result) {
            result = p.val == q.val;

            if (result) {
                result = isSameTree(p.right, q.right);
            }
        }

        return result;
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