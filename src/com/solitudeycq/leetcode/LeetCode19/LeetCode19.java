package com.solitudeycq.leetcode.LeetCode19;

import java.util.ArrayList;
import java.util.List;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);
        while (head.next != null) {
            nodes.add(head.next);
            head = head.next;
        }
        if (nodes.size() == 1 && n == 1) {
            return null;
        }
        int order = nodes.size() - n;
        if (order == 0) {
            ListNode result = nodes.get(1);
            nodes.set(0, null);
            return result;
        } else {
            nodes.get(order-1).next = nodes.get(order).next;
            nodes.get(order).next = null;
            nodes.set(order, null);
            return nodes.get(0);
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
