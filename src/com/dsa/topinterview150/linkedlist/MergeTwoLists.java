package com.dsa.topinterview150.linkedlist;

public class MergeTwoLists {
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        int arr2[] = {1,3,4};
        ListNode node1 = createData(arr);
        ListNode node2 = createData(arr2);
        ListNode head = mergeTwoLists(null,new ListNode(0));

        displayNodes(head);
    }

    static void displayNodes(ListNode head) {
         while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                ListNode newNode = null;
                ListNode head = null;

                while(list1 != null && list2 != null) {
                    if(list1.val <= list2.val){
                        ListNode temp = new ListNode(list1.val);
                        if(newNode == null) {
                            newNode = temp;
                            head = temp;
                        } else {
                            newNode.next = temp;
                        }
                        list1 = list1.next;
                    } else{
                        ListNode temp = new ListNode(list2.val);
                        if(newNode == null) {
                            newNode = temp;
                            head = temp;
                        } else {
                            newNode.next = temp;
                        }
                        list2 = list2.next;
                    }
                    if(newNode.next!= null)
                        newNode = newNode.next;
                }



                while(list1 != null) {
                    ListNode temp = new ListNode(list1.val);
                    if(newNode == null) {
                        newNode = temp;
                        head = temp;
                    } else {
                        newNode.next = temp;
                        newNode = newNode.next;
                    }

                    list1 = list1.next;

                }

                while(list2 != null) {
                    ListNode temp = new ListNode(list2.val);
                    if(newNode == null) {
                        newNode = temp;
                        head = temp;
                    } else {
                        newNode.next = temp;
                        newNode = newNode.next;
                    }

                    list2 = list2.next;
                }

                return head;
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
