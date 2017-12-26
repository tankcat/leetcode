package problems.medium;

import tools.ListNode;

import java.util.Stack;

/**
 * Created by stream on 17-4-22.
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Follow up:
 What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

 Example:

 Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        ListNode head1=l1;
        ListNode head2=l2;
        while(head1!=null&&head2!=null){
            stack1.push(head1.val);
            stack2.push(head2.val);
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            stack1.push(head1.val);
            head1=head1.next;
        }
        while(head2!=null){
            stack2.push(head2.val);
            head2=head2.next;
        }
        ListNode pre=new ListNode(-1);
        pre.next=null;
        int c=0;
        while(!stack1.empty()&&!stack2.empty()){
            int num1=stack1.pop();
            int num2=stack2.pop();
            ListNode node=new ListNode((num1+num2+c)%10);
            c=(num1+num2+c)/10;
            node.next=pre.next;
            pre.next=node;
        }
        while(!stack1.empty()){
            int num1=stack1.pop();

            ListNode node=new ListNode((num1+c)%10);
            c=(num1+c)/10;
            node.next=pre.next;
            pre.next=node;
        }
        while(!stack2.empty()){

            int num2=stack2.pop();
            ListNode node=new ListNode((num2+c)%10);
            c=(num2+c)/10;
            node.next=pre.next;
            pre.next=node;
        }
        if(c!=0){
            ListNode node=new ListNode(c);
            node.next=pre.next;
            pre.next=node;
        }
        return pre.next;
    }
}
