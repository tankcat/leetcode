package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-7.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] ret=new int[n+1];
        ret[0]=0;
        ret[1]=1;
        ret[2]=2;
        for(int i=3;i<n+1;i++){
            ret[i]=ret[i-1]+ret[i-2];
        }
        return ret[n];
    }

    public int countNumber(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        else
            return countNumber(n-1)+countNumber(n-2);
    }



    public static void main(String[] args){
        ClimbingStairs cs=new ClimbingStairs();
        System.out.println(cs.climbStairs(44));
    }
}
