package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 9/1/19
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode input1l1 = new ListNode(5);
        ListNode input1l2 = new ListNode(0);
        ListNode input1l3 = new ListNode(0);
        ListNode input1l4 = new ListNode(0);
        ListNode input1l5 = new ListNode(0);
        ListNode input1l6 = new ListNode(0);
        ListNode input1l7 = new ListNode(0);
        ListNode input1l8 = new ListNode(0);
        ListNode input1l9 = new ListNode(0);
        ListNode input1l10 = new ListNode(0);
        ListNode input1l11 = new ListNode(0);
        ListNode input1l12 = new ListNode(0);
        ListNode input1l13 = new ListNode(0);
        ListNode input1l14 = new ListNode(0);
        ListNode input1l15 = new ListNode(0);
        ListNode input1l16 = new ListNode(0);
        ListNode input1l17 = new ListNode(0);
        ListNode input1l18 = new ListNode(0);
        ListNode input1l19 = new ListNode(0);
        ListNode input1l20 = new ListNode(0);
        ListNode input1l21 = new ListNode(0);
        ListNode input1l22 = new ListNode(0);
        ListNode input1l23 = new ListNode(0);
        ListNode input1l24 = new ListNode(0);
        ListNode input1l25 = new ListNode(0);
        ListNode input1l26 = new ListNode(0);
        ListNode input1l27 = new ListNode(0);
        ListNode input1l28 = new ListNode(0);
        ListNode input1l29 = new ListNode(0);
        ListNode input1l30 = new ListNode(0);
        ListNode input1l31 = new ListNode(1);

        /*input1l1.next = input1l2;
        input1l2.next = input1l3;
        input1l3.next = input1l4;
        input1l4.next = input1l5;
        input1l5.next = input1l6;
        input1l6.next = input1l7;
        input1l7.next = input1l8;
        input1l8.next = input1l9;
        input1l9.next = input1l10;
        input1l10.next = input1l11;
        input1l11.next = input1l12;
        input1l12.next = input1l13;
        input1l13.next = input1l14;
        input1l14.next = input1l15;
        input1l15.next = input1l16;
        input1l16.next = input1l17;
        input1l17.next = input1l18;
        input1l18.next = input1l19;
        input1l19.next = input1l20;
        input1l20.next = input1l21;
        input1l21.next = input1l22;
        input1l22.next = input1l23;
        input1l23.next = input1l24;
        input1l24.next = input1l25;
        input1l25.next = input1l26;
        input1l26.next = input1l27;
        input1l27.next = input1l28;
        input1l28.next = input1l29;
        input1l29.next = input1l30;
        input1l30.next = input1l31;
*/
        ListNode input2l1 = new ListNode(5);
        ListNode input2l2 = new ListNode(6);
        ListNode input2l3 = new ListNode(4);

//        input2l1.next = input2l2;
//        input2l2.next = input2l3;

        ListNode listNode = addTwoNumbers(input1l1, input2l1);

        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode firstNode = null;
        ListNode resultNode = null;

        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + carry;

            if (temp > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            if (firstNode == null) {
                firstNode = new ListNode(temp % 10);
                resultNode = firstNode;
            } else {
                ListNode tempNode = new ListNode(temp % 10);
                resultNode.next = tempNode;
                resultNode = tempNode;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l2 != null) {
            int temp;
            if (carry != 0) {
                temp = carry + l2.val;
            } else {
                temp = l2.val;
            }

            if (temp > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode tempNode = new ListNode(temp % 10);
            resultNode.next = tempNode;
            resultNode = tempNode;
            l2 = l2.next;
        }

        while (l1 != null) {
            int temp;
            if (carry != 0) {
                temp = carry + l1.val;
            } else {
                temp = l1.val;
            }

            if (temp > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode tempNode = new ListNode(temp % 10);
            resultNode.next = tempNode;
            resultNode = tempNode;
            l1 = l1.next;
        }

        if (carry != 0) {
            resultNode.next = new ListNode(1);
        }

        return firstNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
