package com.dsa.topinterview150.linkedlist2;

import com.dsa.topinterview150.linkedlist.LinkedListUtils;
import com.dsa.topinterview150.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] nums1 = {2,4,9};
        ListNode head1 = LinkedListUtils.createData(nums1);

        int[] nums2 = {5,6,4,9} ;
        ListNode head2 = LinkedListUtils.createData(nums2);
        ListNode sumNodes = addTwoNumbersOptimized(head1, head2);
        LinkedListUtils.displayNodes(sumNodes);

    }

    public static ListNode addTwoNumbersOptimized(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){
            int l1Val = l1 != null?l1.val:0;
            int l2Val = l2 != null?l2.val:0;

            int sum = l1Val + l2Val + carry;
            carry = (sum/10)%10;

            temp.next = new ListNode(sum%10);
            temp = temp.next;

            l1 = l1 != null?l1.next:null;
            l2 = l2 != null?l2.next:null;
        }
        return head.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> values = new ArrayList<>();
        getValues(l1,values);
        Collections.reverse(values);

        List<Integer> values2 = new ArrayList<>();
        getValues(l2,values2);
        Collections.reverse(values2);

        ListNode sumNode = new ListNode(0);
        ListNode temp = sumNode;

        int i = values.size() - 1;
        int j = values2.size() - 1;
        int carryOver = 0;

        while(i >= 0 && j >= 0){
            int sum = values.get(i) + values2.get(j) + carryOver;
            int val = sum%10;
            carryOver = (sum/10)%10;
            temp.next = new ListNode(val);
            temp = temp.next;
            i--;
            j--;
        }

        while(i>=0){
            int sum = values.get(i) + carryOver;
            int val = sum%10;
            carryOver = (sum/10)%10;
            temp.next = new ListNode(val);
            temp = temp.next;
            i--;
        }

        while(j>=0){
            int sum = values2.get(j) + carryOver;
            int val = sum%10;
            carryOver = (sum/10)%10;
            temp.next = new ListNode(val);
            temp = temp.next;
            j--;
        }

        if(carryOver > 0) temp.next = new ListNode(carryOver);
        return sumNode.next;
    }

    private static void getValues(ListNode head, List<Integer> values) {
        if(head == null) return;
        values.add(head.val);
        getValues(head.next, values);
    }


}
