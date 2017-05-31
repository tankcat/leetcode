package com.tankcat2.leetcode.easy;

import java.util.Stack;

/**
 * Created by stream on 17-5-31.
 */
public class MyQueue {
    /** Initialize your data structure here. */
    private Stack<Integer> input;
    private Stack<Integer> output;
    public MyQueue() {
        input =new Stack<>();
        output=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();

    }

    /** Get the front element. */
    public int peek() {
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.empty()&&output.empty();
    }
}
