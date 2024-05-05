package com.dsa.topinterview150.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ll2 = new LinkedList();
        ll2.insertFirst(2);
        ll2.insertLast(3);
        ll2.insertLast(4);
        ll2.display();

        ListNode node = reverseList(ll2.getHead());
        System.out.println(node.val);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode newNode = null;

        while(temp.next != null) {
            if(newNode == null) {
                newNode = new ListNode(temp.val);
            } else {
                ListNode node = new ListNode(temp.val);;
                node.next = newNode;
                newNode = node;
            }
            temp = temp.next;
        }

        ListNode node = new ListNode(temp.val);;
        node.next = newNode;
        newNode = node;

        return newNode;
    }


}
