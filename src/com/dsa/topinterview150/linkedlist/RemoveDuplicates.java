package com.dsa.topinterview150.linkedlist;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1};
        ListNode head = LinkedListUtils.createData(arr);
        LinkedListUtils.displayNodes(deleteDuplicatesPointers(head));

    }

    static ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new TreeMap<>();
        while(head!=null){
            map.computeIfPresent(head.val, (key,val)-> val + 1);
            map.computeIfAbsent(head.val, (val)-> 1);
            head = head.next;
         }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        Map<Integer, Integer> treeMap = new TreeMap<>(map);
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
            if(entry.getValue() == 1) {
                tail.next = new ListNode(entry.getKey());
                tail = tail.next;
            }
        }
         return dummy.next;
    }

    static ListNode deleteDuplicatesPointers(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        if(head.next == null)
            return head;

        while(head != null){;
            if(head.next != null && head.val != head.next.val){
                tail.next = new ListNode(head.val);
                tail = tail.next;
                head = head.next;
            } else {
                ListNode temp = head.next;
                while(temp!=null && head.val == temp.val){
                    temp = temp.next;
                }
                head = temp;
            }

            if(head!= null && head.next == null){
                tail.next = new ListNode(head.val);
                break;
            }


        }

        return dummy.next;
    }
}
