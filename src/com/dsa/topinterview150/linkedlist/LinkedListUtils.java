package com.dsa.topinterview150.linkedlist;

public class LinkedListUtils {

    public static void displayNodes(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode createData(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode newNode = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode tempNode = new ListNode(arr[i]);
            newNode.next = tempNode;
            newNode = tempNode;
        }

        return head;
    }
}
