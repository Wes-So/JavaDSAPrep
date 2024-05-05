package com.dsa.topinterview150.linkedlist;

public class MergeTwoLists {
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        int arr2[] = {1,3,4};

        LinkedList ll = new LinkedList();
        ll.insertFirst(4);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.display();

        LinkedList ll2 = new LinkedList();
//        ll2.insertFirst(4);
        ll2.insertFirst(3);
        ll2.insertFirst(1);
        ll2.display();

        ListNode node = mergeTwoLists(ll.getHead(), ll2.getHead());
        LinkedListUtils.displayNodes(node);

    }



    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

                /*
                    Proposed steps:
                        Create new ListNode
                        Loop around node 1 and node 2 if they're both not null:
                            if list1.val == node2.val:
                               add list1 and node2 to new ll
                               list1 = list1.next
                               node2 = node2.next

                            if list1.val > node2.val:
                               add node2.val to new ll
                               node2 = node2.next

                            if list1 < node2.val:
                                add list1 to ndw ll
                                list1 = list1.next
                 */

                ListNode head = new ListNode(0);
                ListNode temp = head;


                while(list1 != null || list2 != null) {

                    if(list1 == null) {
                        temp.next = new ListNode(list2.val);
                        temp = temp.next;
                        list2 = list2.next;
                        continue;
                    }

                    if(list2 == null) {
                        temp.next = new ListNode(list1.val);
                        temp = temp.next;
                        list1 = list1.next;
                        continue;
                    }

                    System.out.println(list1.val);
                    System.out.println(list2.val);

                    if(list1.val == list2.val){
                        temp.next = new ListNode(list1.val);
                        temp = temp.next;
                        temp.next = new ListNode(list2.val);
                        list1 = list1.next;
                        list2 = list2.next;
                    } else if(list1.val > list2.val) {
                        temp.next = new ListNode(list2.val);
                        list2 = list2.next;
                    } else {
                        temp.next = new ListNode(list1.val);
                        list1 = list1.next;
                    }

                    temp = temp.next;
                }

                return head.next;
    }


    static ListNode createData(int[] arr) {
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
