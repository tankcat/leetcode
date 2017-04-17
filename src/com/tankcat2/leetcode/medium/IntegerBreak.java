package com.tankcat2.leetcode.medium;

/**
 * Created by stream on 17-4-10.
 */
public class IntegerBreak {
    public static void main(String[] args){
        IntegerBreak ib=new IntegerBreak();
        System.out.println(ib.integerBreak(1));
    }
    public int integerBreak(int n){
        int[] digit=new int[58];
        digit[0]=0;
        digit[1]=1;
        digit[2]=1;
        digit[3]=2;
        digit[4]=4;
        digit[5]=6;
        digit[6]=9;
        for(int i=7;i<=n;i++){
            if(digit[i-2]*2>digit[i-3]*3)
                digit[i]=digit[i-2]*2;
            else
                digit[i]=digit[i-3]*3;
        }
        return digit[n];
    }
}
