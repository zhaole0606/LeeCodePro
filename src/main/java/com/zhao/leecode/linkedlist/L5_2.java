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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
            calculate(l1, listNodePoint, decimal);
        }
        if (l2 != null) {
            calculate(l2, listNodePoint, decimal);
        }
        return listNode.next;
    }


    private static void calculate(ListNode node, ListNode nodePoint, int decimal) {
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

    public static void main(String[] args) {
//        ListNode l2 = new ListNode(9, null);
//        ListNode l3 = new ListNode(9, l2);
//        ListNode l4 = new ListNode(9, l3);
//        ListNode l5 = new ListNode(9, l4);
//        ListNode l6 = new ListNode(9, l5);
//        ListNode l7 = new ListNode(9, l6);
//
//        ListNode l14 = new ListNode(9, null);
//        ListNode l13 = new ListNode(9, l14);
//        ListNode l12 = new ListNode(9, l13);
//        ListNode l11 = new ListNode(9, l12);
//        addTwoNumbers(l11, l7);

        ListNode l7 = new ListNode(5, null);
        ListNode l14 = new ListNode(5, null);
        addTwoNumbers(l14, l7);


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
