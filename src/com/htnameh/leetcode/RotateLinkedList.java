package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 14/1/19
 */
public class RotateLinkedList {

    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);

        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode listNode = rotateRight(node11, 2);

        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    private static ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        }

        if (head == null) {
            return head;
        }

        ListNode current = head;

        int count = 0;

        while (head.next != null) {
            head = head.next;
            count++;
        }

        count++;

        k = k % count;

        k = Math.abs(count - k);

        if (k == 0) {
            return current;
        }

        head.next = current;

        while (k-- > 0) {
            head = head.next;
        }

        current = head.next;

        head.next = null;

        return current;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}