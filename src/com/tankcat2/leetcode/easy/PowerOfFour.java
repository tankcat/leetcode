package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-9.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num){
        /*if(num==1)
            return true;
        if(num<=0)
            return false;
        if(Math.pow(2,30)%num==0) {
            while (num > 0) {
                num /= 4;
                if(num==1)
                    return true;
            }
        }
        return false;*/
        int count_0 = 0;
        int count_1=0;
        while(num>0){
            if((num&1)!=1)
                ++count_0;
            else {
                ++count_1;
            }
            num>>=1;
        }
        if(count_0%2==0&&count_1==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        PowerOfFour pof=new PowerOfFour();
        System.out.println(pof.isPowerOfFour(64));
    }
}
