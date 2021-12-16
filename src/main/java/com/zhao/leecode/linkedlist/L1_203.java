package com.zhao.leecode.linkedlist;


/**
 * 203. 移除链表元素
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:11 下午
 */

/**
 * 解题思路：引入虚拟头结点。
 */
public class L1_203 {


    public static ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(0);
        h.next = head;

        ListNode temp = h;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return h.next;
    }

    public static void main(String[] args) {
        ListNode l5 = ListNode.listDuplicateByOne();
        removeElements(l5, 1);
    }
}
