package com.dsa.topinterview150.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Cycle {
    public static void main(String[] args) {
        ListNode node = createData();
        System.out.println(hasCycle2(node));
    }

    static boolean hasCycle(ListNode head) {
        boolean hasCycle = false;
        ListNode nextNode = head;
        List <ListNode> collect = new ArrayList<>();
        while(nextNode.next != null) {
            collect.add(nextNode);
            nextNode = nextNode.next;
            if(collect.contains(nextNode)){
                return true;
            }
        }

        return hasCycle;
    }

    static boolean hasCycle2(ListNode head) {
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }

        return false;
    }
    static ListNode createData() {
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeLast = new ListNode(-4);
        node.next = node2;
        node2.next = node0;
        node0.next = nodeLast;
        nodeLast.next = node2;
        return node;
    }

}
