package com.zhao.leecode.linkedlist;


/**
 * 83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:13 下午
 */

/**
 * 结题思路：使用一个前置节点，进行判断
 */
public class L3_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode node = head.next;
        while (node != null) {
            ListNode temp = node;
            if (temp.val == prev.val) {
                prev.next = temp.next;
            } else {
                prev.next = temp;
                prev = prev.next;
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        deleteDuplicates(ListNode.listDuplicateOrderByAsc());
    }
}
