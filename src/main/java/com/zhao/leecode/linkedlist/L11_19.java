package com.zhao.leecode.linkedlist;


/**
 * 19. 删除链表的倒数第 N 个结点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:19 下午
 */

/**
 * 结题思路：
 * 1.跟剑指 Offer 22.结题思路类似，区别在于快指针往后多移一位，然后等快指针到最后了，慢指针的下一个就是需要删除的节点，方便操作。
 * 需要注意的就是删除位在第一位需要单独进行判断下。
 */
public class L11_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int k = 0;

        while (k < (n + 1)) {
            if (fast == null && k == n) {
                return head.next;
            }
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            k++;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(4, l3);
        ListNode l5 = new ListNode(5, l4);

        removeNthFromEnd(l5, 5);
    }
}
