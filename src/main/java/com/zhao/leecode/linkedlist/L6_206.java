package com.zhao.leecode.linkedlist;

/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:15 下午
 */
public class L6_206 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
}
