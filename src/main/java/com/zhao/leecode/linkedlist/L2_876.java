package com.zhao.leecode.linkedlist;

/**
 * 876. 链表的中间结点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:12 下午
 */

/**
 * 解题思路：快慢指针，一开始快慢指针在同一位置，每次循环fast是slow的2的倍，等fast到底后，slow指的就是中间节点。
 * 唯一需要注意的需要判断fast不能为空。
 */
public class L2_876 {


    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (fast == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        middleNode(ListNode.list13OrderByAsc());

    }
}
