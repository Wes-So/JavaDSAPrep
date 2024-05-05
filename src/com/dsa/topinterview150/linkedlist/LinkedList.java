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

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
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
        ListNode temp = new ListNode(val);
        if(tail != null) {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    //TODO
    public void insertToRecursion(int val, int index) {

    }

    public void insertTo(int val, int index){
        ListNode temp = new ListNode(val);
        ListNode tracker = head;

        if(index == 0) {
            this.insertFirst(val);
            size++;
            return;
        }

        for (int i = 0; i < index -1; i++) {
            tracker = tracker.next;
        }

        if(tracker.next != null) {
            temp.next = tracker.next;
        }

        tracker.next = temp;
        size++;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertTo(4,0);
        ll.display();


        LinkedList ll2 = new LinkedList();
        ll2.insertFirst(2);
        ll2.insertLast(3);
        ll2.insertLast(4);
        ll2.display();

        System.out.println(ll2.getTail().val);
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
