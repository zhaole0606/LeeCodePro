package com.zhao.leecode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:15 下午
 */

/**
 * 结题思路：
 * 1：跳出链表结构，因为链表只能单方向，所以先将链表数据复制到数组中。再用双指针判断数组
 */
public class L7_234 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            if (!list.get(l).equals(list.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(ListNode.list13OrderByDesc()));
    }
}
