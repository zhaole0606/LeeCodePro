package com.zhao.leecode.linkedlist;

/**
 * 160. 相交链表
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:19 下午
 */

/**
 * 解题思路：首先判断两个链表的长度，将长链表的一端先循环 直到与短链表位置一致。然后两个链表同时循环
 * 就可以判断节点是否相同
 */
public class L12_160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = 0;
        ListNode aPoint = headA;
        while (aPoint != null) {
            aLen++;
            aPoint = aPoint.next;
        }

        int bLen = 0;
        ListNode bPoint = headB;
        while (bPoint != null) {
            bLen++;
            bPoint = bPoint.next;
        }


        aPoint = headA;
        bPoint = headB;

        int diff = bLen - aLen;

        if (diff > 0) {
            while (diff != 0) {
                bPoint = bPoint.next;
                diff--;
            }
        }

        if (diff < 0) {
            while (diff != 0) {
                aPoint = aPoint.next;
                diff++;
            }
        }

        while (aPoint != null && bPoint != null) {
            if (aPoint == bPoint) {
                return aPoint;
            }
            aPoint = aPoint.next;
            bPoint = bPoint.next;
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
