package org.example.easy;

import org.example.util.ListNode;

public class Task206 {




    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode res = new ListNode(head.val, null);
        ListNode curr = head;
        while (curr.next != null) {
            ListNode nNode = curr.next;
            //1-2-3-4-null
            //4-3-2-1-null
            res = new ListNode(nNode.val, res);
            curr = curr.next;
        }
        return res;
    }
}
