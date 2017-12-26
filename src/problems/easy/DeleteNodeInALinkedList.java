package problems.easy;

import tools.ListNode;

/**
 * Created by stream on 17-4-19.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

}
