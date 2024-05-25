package com.dsa.topinterview150.linkedlist;

public class LinkedListUtils {

//    public static void displayNodes(ListNode head) {
//
//        while(head != null) {
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//
//        System.out.println("END");
//    }

    public static void displayNodes(ListNode root){
        if(root == null){
            System.out.println("END");
            return;
        }
        System.out.print(root.val + "->");
        displayNodes(root.next);
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
