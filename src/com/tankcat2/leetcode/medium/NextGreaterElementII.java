package com.tankcat2.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by stream on 17-5-25.
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

 Example 1:
 Input: [1,2,1]
 Output: [2,-1,2]
 Explanation: The first 1's next greater number is 2;
 The number 2 can't find next greater number;
 The second 1's next greater number needs to search circularly, which is also 2.
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] ret=new int[nums.length];
        Arrays.fill(ret,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            int num =nums[i%nums.length];
            while(stack.empty()==false&&nums[stack.peek()]<num)
                ret[stack.pop()]=num;
            if(i<nums.length)
                stack.push(i);
        }
        return ret;
    }

    public static void main(String[] args){
        NextGreaterElementII obj=new NextGreaterElementII();
        int[] nums={1,4,3,2,1};
        obj.nextGreaterElements(nums);

    }
}
