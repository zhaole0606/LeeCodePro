package com.zhao.leecode.linkedlist;


/**
 * 328. 奇偶链表
 * https://leetcode-cn.com/problems/odd-even-linked-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:17 下午
 */

/**
 * 解题思路：新建两个链表以及指针， 用来存放原本链表中的奇偶数据，循环完毕后将偶数链表挂在奇数链表的最后。
 */
public class L8_328 {
    public static ListNode oddEvenList(ListNode head) {
        int step = 1;
        ListNode nodePoint = head;
        ListNode odd = new ListNode(1);
        ListNode even = new ListNode(0);
        ListNode oddPoint = odd;
        ListNode evenPoint = even;

        while (nodePoint != null) {
            if (step % 2 == 0) {
                //偶数
                evenPoint.next = nodePoint;
                evenPoint = evenPoint.next;
            } else {
                //奇数
                oddPoint.next = nodePoint;
                oddPoint = oddPoint.next;
            }

            step++;
            nodePoint = nodePoint.next;
        }
        oddPoint.next = null;
        evenPoint.next = null;
        oddPoint.next = even.next;

        return odd.next;
    }

    public static void main(String[] args) {
//        ListNode l5 = new ListNode(5, null);
//        ListNode l4 = new ListNode(4, l5);
//        ListNode l1 = new ListNode(3, l4);
//        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(1, null);
        oddEvenList(null);
    }
}
