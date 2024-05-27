package com.dsa.topinterview150.linkedlist2;

import com.dsa.topinterview150.linkedlist.ListNode;

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
        /*
            1. Keep all nodes in a list that we've passed.
            2. Every node we meet, check if next value is in the list.
            3. If yes return true;
            4. O(N) as we need to pass everything if there's no cycle.
            5. There's a faster algorithm used.  Review that next time.
         */
        List<ListNode> values = new ArrayList<>();
        while(head!=null){
            if(values.contains(head)) return true;
            values.add(head);
            head = head.next;
        }

        System.out.println(values);
        return false;
    }
}
