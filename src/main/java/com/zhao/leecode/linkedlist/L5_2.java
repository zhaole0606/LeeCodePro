package com.zhao.leecode.linkedlist;


/**
 * 2. 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:14 下午
 */

/**
 * 解题思路：新建立一个伪节点，用于存储两个链表相加的值，需要注意的是 如果链表一长一短，需要对长链表单独处理。
 * 还有一点就是。最后一位相加超过10 需要在挂一个节点。
 */
public class L5_2 {
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int decimal = 0;
        ListNode listNode = new ListNode(0);
        ListNode listNodePoint = listNode;

        while (l1 != null && l2 != null) {
            int r = l1.val + l2.val + decimal;
            if (r >= 10) {
                r -= 10;
                decimal = 1; //进位
            } else {
                decimal = 0;
            }

            l1 = l1.next;
            l2 = l2.next;

            listNodePoint.next = new ListNode(r);
            listNodePoint = listNodePoint.next;
            if (l1 == null && l2 == null && decimal == 1) {
                listNodePoint.next = new ListNode(1);
                break;
            }
        }

        if (l1 != null) {
            calculate1(l1, listNodePoint, decimal);
        }
        if (l2 != null) {
            calculate1(l2, listNodePoint, decimal);
        }
        return listNode.next;
    }


    private static void calculate1(ListNode node, ListNode nodePoint, int decimal) {
        while (node != null) {
            int r = node.val + decimal;
            if (r >= 10) {
                r -= 10;
                decimal = 1; //进位
            } else {
                decimal = 0;
            }
            nodePoint.next = new ListNode(r);
            node = node.next;
            nodePoint = nodePoint.next;
            if (node == null && decimal == 1) {
                nodePoint.next = new ListNode(decimal);
            }
        }
    }

    /**
     * 优化版 省去了不少重复判断
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode listNode = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode tail = listNode;

        while (p1 != null || p2 != null) {
            int sum = 0;
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            tail.next = new ListNode(sum % 10);
            carry = sum / 10;
            tail = tail.next;
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return listNode.next;
    }


    public static void main(String[] args) {
        ListNode l2 = new ListNode(9, null);
        ListNode l3 = new ListNode(9, l2);
        ListNode l4 = new ListNode(9, l3);
        ListNode l5 = new ListNode(9, l4);
        ListNode l6 = new ListNode(9, l5);
        ListNode l7 = new ListNode(9, l6);

        ListNode l14 = new ListNode(9, null);
        ListNode l13 = new ListNode(9, l14);
        ListNode l12 = new ListNode(9, l13);
        ListNode l11 = new ListNode(9, l12);
        addTwoNumbers2(l11, l7);

//        ListNode l7 = new ListNode(5, null);
//        ListNode l14 = new ListNode(5, null);
//        addTwoNumbers1(l14, l7);


//        ListNode l2 = new ListNode(3, null);
//        ListNode l3 = new ListNode(4, l2);
//        ListNode l4 = new ListNode(2, l3);
//
//        ListNode l14 = new ListNode(4, null);
//        ListNode l13 = new ListNode(6, l14);
//        ListNode l12 = new ListNode(5, l13);
//        addTwoNumbers(l4, l12);

    }
}
