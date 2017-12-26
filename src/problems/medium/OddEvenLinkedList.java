package problems.medium;

import tools.ListNode;

/**
 * Created by stream on 17-4-19.
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode odd=head;
        ListNode odd_pointer=head;
        ListNode even=head.next;
        ListNode even_pointer=head.next;
        ListNode pointer=even.next;
        int count=0;
        while(pointer!=null){
            count++;
            if(count%2==1) {
                odd_pointer.next = pointer;
                odd_pointer=odd_pointer.next;
            }else{
                even_pointer.next = pointer;
                even_pointer=odd_pointer.next;
            }
            pointer=pointer.next;
        }
        odd_pointer.next=even;
        even_pointer.next=null;
        return odd;
    }
}
