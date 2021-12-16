package com.zhao.leecode.linkedlist;


/**
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:13 下午
 */


/**
 * 解题思路：建立一个新的链表节点，然后再分别循环判断l1和l2的节点数据大小。接入到新节点的尾节点后面。
 */
public class L4_Offer_25 {
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode listPoint = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                listPoint.next = l2;
                l2 = l2.next;
            } else {
                listPoint.next = l1;
                l1 = l1.next;
            }
            listPoint = listPoint.next;
        }

        if (l1 != null) {
            listPoint.next = l1;
        }
        if (l2 != null) {
            listPoint.next = l2;
        }
        return listNode.next;
    }

    /**
     * 解题思路：不在原数组上处理，建立头尾节点
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        //虚拟头结点
        ListNode head = new ListNode();
        ListNode tail = head;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                tail.next = p1;
                tail = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                tail = p2;
                p2 = p2.next;
            }
        }
        if (p1 != null) {
            tail.next = p1;
        }
        if (p2 != null) {
            tail.next = p2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, null);
        ListNode l2 = new ListNode(6, l1);
        ListNode l3 = new ListNode(5, l2);
        ListNode l4 = new ListNode(3, l3);

        ListNode l5 = new ListNode(4, null);
        ListNode l6 = new ListNode(2, l5);
        ListNode l7 = new ListNode(1, l6);

        mergeTwoLists2(l4, l7);
    }
}
