package org.example.medium;

import org.example.util.ListNode;

public class Task2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode pointer1 = l1, pointer2 = l2, currentNode = res;
        int buff = 0;
        while (pointer1 != null || pointer2 == null) {
            int v1 = (pointer1 == null) ? 0 : pointer1.val;
            int v2 = (pointer2 == null) ? 0 : pointer2.val;

            int sum = v1 + v2 + buff;

            buff = sum / 10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }
            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }

        }
        if (buff > 0) {
            currentNode.next = new ListNode(buff);
        }
        return res;
    }


}
