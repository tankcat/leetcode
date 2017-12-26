package problems.easy;

import sun.text.normalizer.UBiDiProps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by stream on 17-4-11.
 */
public class MyStack {
    /** Initialize your data structure here. */
    private ArrayList<Integer> myStack;
    public MyStack() {
       myStack=new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        myStack.add(x);
        HashMap<Integer,Integer> map;
        LinkedList<Integer> listr;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int ret=myStack.get(myStack.size()-1);
        myStack.remove(myStack.size()-1);
        return ret;
    }

    /** Get the top element. */
    public int top() {
        return myStack.get(myStack.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(myStack==null||myStack.size()==0)
            return true;
        else
            return false;
    }
}
