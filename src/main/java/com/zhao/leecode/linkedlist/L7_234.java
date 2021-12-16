package com.zhao.leecode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:15 下午
 */

/**
 * 解题思路：
 * 1：跳出链表结构，因为链表只能单方向，所以先将链表数据复制到数组中。再用双指针判断数组
 * 2: 先获取链表的中间位置，然后将后面一半的链表翻转，再跟前面比较。
 */
public class L7_234 {
    public static boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            if (!list.get(l).equals(list.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode midNodeList = findMidNode(head);
        ListNode reverseNodeList = reverseNodeList(midNodeList);
        ListNode p = head;
        ListNode q = reverseNodeList;
        while (q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }

    public static ListNode findMidNode(ListNode listNode) {
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static ListNode reverseNodeList(ListNode listNode) {
        ListNode prev = null;
        ListNode head = listNode;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }


    public static void main(String[] args) {
        isPalindrome2(ListNode.listOdd());
    }
}
