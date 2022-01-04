package com.zhao.leecode.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:07 下午
 */
public class L4_Offer_06 {
    List<Integer> result = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        reveser(head);
        int[] resultArr = new int[result.size()];
        int i = 0;
        for (Integer k : result) {
            resultArr[i++] = k;
        }
        return resultArr;
    }


    private void reveser(ListNode head) {
        if (head == null) {
            return;
        }
        reveser(head.next);
        result.add(head.val);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(2);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(4);
        ListNode r5 = new ListNode(5);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = null;

        L4_Offer_06 a = new L4_Offer_06();
        int[] r = a.reversePrint(r1);
        System.out.println("");
    }

}
