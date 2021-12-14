package com.zhao.leecode.linkedlist;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:20 下午
 */

/**
 * 解题思路：
 * 1. 快慢指针 ，循环链表，用快指针去追慢指针，如果追到就说明有环，如果没有则说明是不想交
 */
public class L13_141 {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(13);
        ListNode l12 = new ListNode(12, l11);
        System.out.println(hasCycle(l12));
    }
}
