package com.dsa.topinterview150.linkedlist;

public class LinkedList {


    private ListNode head;
    private ListNode tail;

    private int size;

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;
        size++;
    }

    public void insertLast(int val) {

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.display();
        System.out.println(ll.getTail().val);
    }


    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}
