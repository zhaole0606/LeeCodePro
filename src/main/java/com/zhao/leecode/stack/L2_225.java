package com.zhao.leecode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:55 上午
 */

/**
 * 解题思路：
 */
public class L2_225 {

    private Queue<Integer> inQueue;//输入队列
    private Queue<Integer> outQueue;//输出队列

    public L2_225() {
        inQueue = new LinkedList<Integer>();
        outQueue = new LinkedList<Integer>();
    }

    public void push(int x) {
        inQueue.add(x);

        while (!outQueue.isEmpty()) {
            inQueue.offer(outQueue.poll());
        }

        Queue tem = inQueue;
        inQueue = outQueue;
        outQueue = tem;


    }

    public int pop() {
        return outQueue.poll();
    }

    public int top() {
        return outQueue.peek();
    }

    public boolean empty() {
        return outQueue.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        L2_225 queue = new L2_225();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.top());
    }
}
