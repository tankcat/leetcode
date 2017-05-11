package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-5-11.
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int tmp=0;
        for(int i=digits.length-1;i>=0;i--){
            tmp=digits[i];
            digits[i]=(tmp+carry)%10;
            carry=(tmp+carry)/10;
            if(carry==0)
                break;
        }
        if(carry==1){
            int[] ret=new int[digits.length+1];
            System.arraycopy(digits,0,ret,1,digits.length);
            ret[0]=carry;
            return ret;
        }else
            return digits;
    }
}
