package org.example.easy;


class Task83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.val == currNode.val) {
                currNode.next = currNode.next.next;

            } else {
                currNode = currNode.next;
            }


        }
        return head;
    }
     static class ListNode {
        int val;
        ListNode next;


         ListNode(int val) {
            this.val = val;
        }

    }

}
