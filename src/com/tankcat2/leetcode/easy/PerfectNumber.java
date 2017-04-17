package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-11.
 */
public class PerfectNumber {
    public static void main(String[] args){
        PerfectNumber pn=new PerfectNumber();
        System.out.println(pn.checkPerfectNumber(6));
    }

    public boolean checkPerfectNumber(int num){
        if(num<=1)
            return false;
        int sum=1;
        double num_sqrt=Math.sqrt(num);
        for(int i=2;i<num_sqrt;i++){
            if(num%i==0)
                sum=sum+i+num/i;
        }
        if(num%num_sqrt==0)
            sum+=num_sqrt;
        if(sum==num)
            return true;
        else
            return false;
    }
}
