package com.dsa.topinterview150.linkedlist2;

import com.dsa.topinterview150.linkedlist.LinkedListUtils;
import com.dsa.topinterview150.linkedlist.ListNode;

import java.util.Stack;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ListNode head = LinkedListUtils.createData(nums);
        int left = 1;
        int right = 1;
        ListNode reversed = reverseBetween(head, left, right);
        LinkedListUtils.displayNodes(reversed);
    }

    /*
        1. loop until you hit the left node
        2. if the next node is greater or equal to left, continue until hitting right node.
        3. add the values to the stack.
        4. connect the right.next to the end of new listnode
    */
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newNode = new ListNode(0);
        ListNode dummy = newNode;
        Stack<Integer> stack = new Stack<>();
        int ctr = 1;

        while(head != null){
            if(ctr < left){
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            } else if(ctr <= right){
                stack.add(head.val);
            } else {
                while(!stack.isEmpty()){
                    dummy.next = new ListNode(stack.pop());
                    dummy = dummy.next;
                }
                dummy.next = head;

                break;
            }
            head = head.next;
            ctr++;
        }

        while(!stack.isEmpty()){
            dummy.next = new ListNode(stack.pop());
            dummy = dummy.next;
        }


        return newNode.next;
    }


}
