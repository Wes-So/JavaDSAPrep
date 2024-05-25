package com.dsa.topinterview150.linkedlist2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(-4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        System.out.println(hasCycle(head));
        System.out.println(hasCycle(new ListNode(1)));
    }

    public static boolean hasCycle(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while(head!=null){
            if(values.contains(head.val)) return true;
            values.add(head.val);
            head = head.next;
        }

        System.out.println(values);
        return false;
    }
}
