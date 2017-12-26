package problems.medium;

import tools.ListNode;

/**
 * Created by stream on 17-4-22.
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_pre=new ListNode(-1);
        l1_pre.next=l1;
        ListNode l2_pre=new ListNode(-1);
        l1_pre.next=l2;
        ListNode l1_head=l1;
        ListNode l2_head=l2;
        int c=0;
        while(l1_head!=null&&l2_head!=null){
            int tmp=c;
            c=(l1_head.val+l2_head.val+c)/10;
            l1_head.val=(l1_head.val+l2_head.val+tmp)%10;
            l1_pre=l1_head;
            l1_head=l1_head.next;
            l2_pre=l2_head;
            l2_head=l2_head.next;
        }
        if(l1_head!=null){
            while(l1_head!=null){
                int tmp=c;
                c=(l1_head.val+c)/10;
                l1_head.val=(l1_head.val+tmp)%10;
                l1_pre=l1_head;
                l1_head=l1_head.next;
            }

        }
        if(l2_head!=null){
            l1_pre.next=l2_head;
            l1_head=l2_head;
            while(l1_head!=null){
                int tmp=c;
                c=(l1_head.val+c)/10;
                l1_head.val=(l1_head.val+tmp)%10;
                l1_pre=l1_head;
                l1_head=l1_head.next;
            }

        }
        if(c!=0){
            ListNode last=new ListNode(c);
            last.next=null;
            l1_pre.next=last;
        }
        return l1;
    }

    public void print(){
        ListNode l1=new ListNode(1);
        //ListNode node2=new ListNode(8);
        //ListNode node3=new ListNode(3);
        l1.next=null;
        //node2.next=null;
        //node3.next=null;
        ListNode l2=new ListNode(9);
        ListNode node4=new ListNode(9);
        //ListNode node5=new ListNode(6);
        //ListNode node6=new ListNode(1);
        l2.next=node4;
        node4.next=null;
        //node5.next=node6;
        //node6.next=null;
        ListNode ret=addTwoNumbers(l1,l2);
        while(ret!=null){
            System.out.print(ret.val);
            ret=ret.next;
        }
    }

    public static void main(String[] args){
        AddTwoNumbers obj=new AddTwoNumbers();
        obj.print();

    }
}
