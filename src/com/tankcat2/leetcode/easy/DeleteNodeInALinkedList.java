package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-19.
 */
public class DeleteNodeInALinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

}
