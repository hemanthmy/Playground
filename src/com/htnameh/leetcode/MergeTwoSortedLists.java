package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 11/1/19
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(4);
        ListNode node14 = new ListNode(5);

        node11.next = node12;
        node12.next = node13;
        node13.next = node14;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);

        node21.next = node22;
        node22.next = node23;

        ListNode result = mergeTwoLists(node11, node21);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int size1 = 0;
        int size2 = 0;

        ListNode list1 = l1;
        ListNode list2 = l2;

        while (l1 != null) {
            size1++;
            l1 = l1.next;
        }

        while (l2 != null) {
            size2++;
            l2 = l2.next;
        }

        int smallestList = size1 > size2 ? size2 : size1;

        ListNode result = null;

        while (smallestList != 0) {
            if (list1.val <= list2.val) {
                ListNode temp = list1.next;
                if (result == null) {
                    result = temp;
                }
                result.next = new ListNode(list2.val);
                result.next.next = temp;
            }
            list1 = list1.next;
            list2 = list2.next;
            smallestList--;
        }

        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
