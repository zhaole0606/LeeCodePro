package com.zhao.leecode.linkedlist;


/**
 * @Author Le Zhao
 * @Date 2021/12/10 5:56 下午
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 升序链表
     */
    public static ListNode list13OrderByAsc() {
        ListNode listNode = list13OrderByDesc();
        ListNode node = listNode;
        ListNode prev = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }


    /**
     * 降序链表
     */
    public static ListNode list13OrderByDesc() {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(4, l3);
        ListNode l5 = new ListNode(5, l4);
        ListNode l6 = new ListNode(6, l5);
        ListNode l7 = new ListNode(7, l6);
        ListNode l8 = new ListNode(8, l7);
        ListNode l9 = new ListNode(9, l8);
        ListNode l10 = new ListNode(10, l9);
        ListNode l11 = new ListNode(11, l10);
        ListNode l12 = new ListNode(12, l11);
        ListNode l13 = new ListNode(13, l12);
        return l13;
    }

    /**
     * 有重复数据链表
     */
    public static ListNode listDuplicateByOne() {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(4, l3);
        ListNode l5 = new ListNode(1, l4);
        ListNode l6 = new ListNode(6, l5);
        ListNode l7 = new ListNode(1, l6);
        ListNode l8 = new ListNode(8, l7);
        ListNode l9 = new ListNode(9, l8);
        ListNode l10 = new ListNode(10, l9);
        ListNode l11 = new ListNode(11, l10);
        ListNode l12 = new ListNode(12, l11);
        ListNode l13 = new ListNode(1, l12);
        return l13;
    }
    /**
     * 有重复升序数据链表
     */
    public static ListNode listDuplicateOrderByAsc() {
        ListNode l1 = new ListNode(8, null);
        ListNode l2 = new ListNode(7, l1);
        ListNode l3 = new ListNode(6, l2);
        ListNode l4 = new ListNode(6, l3);
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);
        ListNode l7 = new ListNode(4, l6);
        ListNode l8 = new ListNode(3, l7);
        ListNode l9 = new ListNode(2, l8);
        ListNode l10 = new ListNode(2, l9);
        ListNode l11 = new ListNode(1, l10);
        ListNode l12 = new ListNode(1, l11);
        ListNode l13 = new ListNode(1, l12);
        return l13;
    }
}
