package com.zhao.leecode.stack;

import com.zhao.leecode.linkedlist.ListNode;

/**
 * @Author Le Zhao
 * @Date 2021/12/21 6:07 下午
 */
public class LinkedListQueue {
    private class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode head = null;
    private ListNode tail = null;

    public void enqueue(int value) {
        ListNode newNode = new ListNode(value, null);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Integer dequeue() {
        if (head == null) {
            return null;
        }
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;

    }


}
