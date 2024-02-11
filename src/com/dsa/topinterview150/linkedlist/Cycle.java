package com.dsa.topinterview150.linkedlist;



public class Cycle {

    /*
    This problem can be solved in 2 ways:
       1) Use a set to store nodes that have been traversed and check if it's existing.
       2) Use fast and slow (Two Pointer) method and eventually if there's a cycle then both nodes will be the same.
     */

    public static void main(String[] args) {
        ListNode node = createData();
        System.out.println(hasCycle(node));
    }

    static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println(slow.val);
                System.out.println(fast.val);
                return true;
            }
        }

        return false;
    }


    static ListNode createData() {
        LinkedList ll = new LinkedList();
        ll.insertFirst(-4);
        ll.insertFirst(0);
        ll.insertFirst(2);
        ll.insertFirst(3); 

        return ll.getHead();
    }

}
