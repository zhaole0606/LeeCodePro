package com.zhao.leecode.linkedlist;


/**
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:13 下午
 */

/**
 * 结题思路：建立一个伪节点，然后再分别循环判断l1和l2的节点数据。接入到尾节点后面。
 */
public class L4_Offer_25 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode index = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                index.next = l2;
                l2 = l2.next;
            } else {
                index.next = l1;

                l1 = l1.next;
            }
            index = index.next;
        }

        if (l1 != null) {
            index.next = l1;
        }
        if (l2 != null) {
            index.next = l2;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(10, null);
//        ListNode l2 = new ListNode(9, l1);
//        ListNode l3 = new ListNode(4, l2);
//        ListNode l4 = new ListNode(3, l3);

        ListNode l5 = new ListNode(9, null);
        ListNode l6 = new ListNode(4, l5);
        ListNode l7 = new ListNode(3, l6);

        mergeTwoLists(null, null);
    }
}
