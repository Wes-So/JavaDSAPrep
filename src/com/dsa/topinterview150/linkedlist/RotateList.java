package com.dsa.topinterview150.linkedlist;

public class RotateList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        ListNode head = LinkedListUtils.createData(nums);

        head = rotateRight(head,k);
        LinkedListUtils.displayNodes(head);
    }

    /*

    1. If the linked list is empty or has only one node, or if k is zero, the rotation has no effect, and the original linked list is returned.
    2. Calculate the size of the linked list.
    3. Update k to be the remainder of the division of k by the size of the linked list to handle cases where k is larger than the size of the linked list.
    4. Traverse the linked list until the (size - k)-th node. Adjust the pointers to perform the rotation.

     */
    static ListNode rotateRight(ListNode head, int k) {
        ListNode last = head;
        ListNode first = head;
        ListNode maid = head;

        int i = getSize(head);
        k = k%i;

        if(i <=1)
            return head;

        while(last != null && k!=0){
            if(last.next == null){
                last.next = first;
                first = last;
                maid.next = null;
                k--;
            } else {
                maid = last;
                last = last.next;
            }
        }


        return first;
    }

    static int getSize(ListNode node) {
        int i = 0;
        while(node !=null){
            i++;
            node = node.next;
        }
        return i;
    }

}
