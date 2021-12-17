package com.zhao.leecode.linkedlist;


/**
 * 25. K 个一组翻转链表
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 *
 * @Author Le Zhao
 * @Date 2021/12/10 2:17 下午
 */

/**
 * 解题思路： 建立一个下标和一个用来存储反转的链表sub 临时链表 ，k自增 用来判断是否到K，
 * 反转sub 挂在结果链表res中....//TODO:.只能说解决了 性能待优化
 */
public class L9_25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        //用于接受新结果的数组和索引
        ListNode res = new ListNode(0);
        ListNode resPoint = res;

        //用于获取需要反转的链表段
        ListNode sub = new ListNode(0);
        ListNode subPoint = sub;

        ListNode listPoint = head;
        while (listPoint != null) {
            int i = 0;
            //获取小段落链表
            subPoint.next = new ListNode(listPoint.val);
            subPoint = subPoint.next;
            i++;

            //获取需要反转的链表
            if (i == k) {
                //反转
                ListNode reversal = reversal(sub);

                //将反转列表赋值给结果链表
                resPoint.next = reversal;

                //移动结果的指针用于
                while (resPoint != null) {
                    if (resPoint.next != null) {
                        resPoint = resPoint.next;
                    } else {
                        break;
                    }
                }
                //子链表置空，重新统计
                sub = new ListNode(0);
                subPoint = sub;
            }

            listPoint = listPoint.next;

            //对尾巴进行收尾
            if (listPoint == null && i < k) {
                //
                resPoint.next = sub.next;
            }

        }
        return res.next;
    }

    /**
     * 反转
     */
    private static ListNode reversal(ListNode node) {
        ListNode prev = null;
        ListNode head = node.next;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l9 = new ListNode(9, null);
//        ListNode l10 = new ListNode(10, l9);
//        ListNode l11 = new ListNode(11, l10);
//        ListNode l12 = new ListNode(12, l11);
//        ListNode l13 = new ListNode(13, l12);
        reverseKGroup(l9, 9);
    }
}
