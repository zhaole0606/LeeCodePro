package com.zhao.leecode.linkedlist;


/**
 * 83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:13 下午
 */

/**
 * 解题思路：原链表处理，使用一个前置节点，从当前列表的下一个开始循环，再使用前一个节点和当前节点进行判断，
 */
public class L3_83 {
    public static ListNode deleteDuplicates1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode p = head.next;
        while (p != null) {
            ListNode temp = p;
            if (temp.val == prev.val) {
                prev.next = temp.next;
            } else {
                prev.next = temp;
                prev = prev.next;
            }
            p = p.next;
        }
        return head;
    }

    /**
     * 解题思路： 新建立一个虚拟链表和一个尾指针，用原链表跟虚拟链表比较，将数据插入尾节点
     */
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode newHead = new ListNode(-111);
        ListNode tail = newHead;
        ListNode p = head;

        while (p != null) {
            ListNode tmp = p.next;
            if (p.val != tail.val) {
                tail.next = p;
                p.next = null;
                tail = p;
            }
            p = tmp;
        }

        return newHead.next;
    }

    public static void main(String[] args) {
        deleteDuplicates2(ListNode.listDuplicateOrderByAsc());
    }
}
