package com.dsa.grind75;

import java.util.Stack;

class MyQueue {

    public Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if(stack.empty()) return stack.pop();
        return stack.removeFirst();
    }

    public int peek() {
        if(stack.empty()) return stack.peek();
        return stack.getFirst();
    }

    public boolean empty() {
        return stack.empty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.peek());
        queue.push(1);
        queue.push(2);
        System.out.println(queue.stack);
        System.out.println(queue.peek());
        System.out.println(queue.stack);
        System.out.println(queue.pop());
        System.out.println(queue.stack);
        System.out.println(queue.empty());
    }
}