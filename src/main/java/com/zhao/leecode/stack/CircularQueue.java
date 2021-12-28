package com.zhao.leecode.stack;

/**
 * 循环队列
 *
 * @Author Le Zhao
 * @Date 2021/12/17 3:48 下午
 */
public class CircularQueue {
    private String[] items;
    private int n;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int n) {
        this.items = new String[n];
        this.n = n;
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(2 % 5));
    }
}
