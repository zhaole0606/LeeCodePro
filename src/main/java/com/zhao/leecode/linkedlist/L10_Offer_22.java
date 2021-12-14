package com.zhao.leecode.linkedlist;


/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:18 下午
 */

/**
 * 结题思路：快慢指针，快指针先循环到 k点，然后再慢指针循环，等到快指针到头的时候。慢指针就是需要删除的节点
 */
public class L10_Offer_22 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int beginIndex = 0;
        while (beginIndex < k) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            beginIndex++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        getKthFromEnd(l2, 3);
    }
}
