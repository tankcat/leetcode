package problems.easy;

/**
 * Created by stream on 17-4-19.
 */
public class ReverseLinkedList {
    class ListNode{
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode preHead=new ListNode(-1);
        ListNode pointer=head;
        while(pointer!=null){
            ListNode tmp=pointer;
            pointer=pointer.next;
            tmp.next=preHead.next;
            preHead.next=tmp;
        }
        return preHead.next;
    }
}
