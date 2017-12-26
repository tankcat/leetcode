package problems.easy;

import tools.ListNode;

/**
 * Created by stream on 17-4-22.
 * Question: Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        fast=head;
        slow=reverseList(slow);
        while(slow!=null){
            if(fast.val!=slow.val)
                return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
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
