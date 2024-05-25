package com.dsa.topinterview150.linkedlist2;

import com.dsa.topinterview150.linkedlist.LinkedListUtils;
import com.dsa.topinterview150.linkedlist.ListNode;

import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        ListNode node1 = LinkedListUtils.createData(nums1);
        int[] nums2 = {1,3,4};
        ListNode node2 = LinkedListUtils.createData(nums2);
        ListNode merged = mergeTwoLists(node1, node2);
        displayNodes(merged);



    }

    public static void displayNodes(ListNode root){
        if(root == null){
            System.out.println("END");
            return;
        }
        System.out.print(root.val + "->");
        displayNodes(root.next);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        temp.next = list1 !=null?list1:list2;
        return head.next;
    }
}
