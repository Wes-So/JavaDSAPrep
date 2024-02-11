package com.dsa.topinterview150.linkedlist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};
        //[0,0,0,0,0,0,0,0,0,0,1]

        ListNode l1 = LinkedListUtils.createData(nums1);
        ListNode l2 = LinkedListUtils.createData(nums2);

        ListNode l3 = addTwoNumbers(l1, l2);
        //LinkedListUtils.displayNodes(l3);
        //System.out.println(9 - 1999999999);


    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //get all values
        List<Integer> al1 = extractListNodeValues(l1);
        List<Integer> al2 = extractListNodeValues(l2);

        if(al1.size() < al2.size()){
            al1 = padList(al1, al2.size());
        }

        System.out.println("AL1:" + al1);
        System.out.println("AL2:" + al2);

        int i = 0;
        int j = 0;
        int carryOver = 0;
        List<Integer> al3 = new ArrayList<>();
        //main loop
        while(i < al1.size()  && j < al2.size()){
            int sum = al1.get(i) + al2.get(j) + carryOver;
            if(sum > 9) {
                sum-=10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }

            al3.add(sum);
            i++;
            j++;
        }

        System.out.println("After main loop:" + al3);

        //al1 Loop
        while(i < al1.size()){
            int sum = al1.get(i) + carryOver;
            if(sum > 9) {
                sum-=10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }

            al3.add(sum);

            i++;
            if(al1.get(i-1) + carryOver > 9 && i >al1.size())
                al3.add(carryOver);
        }

        System.out.println("After al1 loop:" + al3);

        while(j < al2.size()){
            int sum = al2.get(j) + carryOver;
            if(sum > 9 && j-1 != -1) {
                sum-=10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }

            al3.add(sum);
            j++;
            if(al2.get(j-1) > 9 && j > al2.size())
                al3.add(carryOver);

        }

        //handle carryOver
        if(carryOver == 1)
            al3.add(carryOver);

        //create new linked list
        System.out.println("final:" + al3);

        ListNode head = new ListNode(al3.get(0));
        //System.out.println("Head val:" + head.val);
        ListNode newNode = head;
        for (int k = 1; k < al3.size(); k++) {
            //System.out.println("NewNode:" + newNode.val);
            ListNode temp = new ListNode(al3.get(k));
            newNode.next = temp;
            newNode = temp;
        }


        return head;

    }

    static List<Integer> padList(List<Integer> al1, int target) {
        List<Integer> out = new ArrayList<>();
        int idx = target - al1.size();
        for (int i = 0; i < idx; i++) {
            out.add(0);
        }

        al1.addAll(out);

        return al1;
    }

    private static String getStringValue(List<Integer> al1) {
        String l1Str = "";
        for (int i = al1.size() -1; i > -1 ; i--) {
            l1Str += al1.get(i);
        }
        return l1Str;
    }

    private static List<Integer> extractListNodeValues(ListNode l1) {
        List<Integer> al1 = new ArrayList<>();
        while(l1 != null ) {
            al1.add(l1.val);
            l1 = l1.next;
        }
        return al1;
    }

    public ListNode addTwoNumbersBetter(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = (sum >= 10) ? 1 : 0;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummyHead.next;
    }
}
