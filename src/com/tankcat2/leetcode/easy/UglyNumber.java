package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-8.
 */
public class UglyNumber {
    public static void main(String[] args){
        UglyNumber un=new UglyNumber();
        System.out.println(un.isUgly(14));
    }

    public boolean isUgly(int num){
        if(num<=0)
            return false;
        boolean flag=false;
        while(num>1){
            if(num%2==0) {
                num /= 2;
                flag=true;
            }
            if(num%3==0) {
                num /= 3;
                flag=true;
            }
            if(num%5==0) {
                num /= 5;
                flag=true;
            }
            if(flag==false)
                break;
            else
                flag=false;
        }
        if(num>1)
            return false;
        else
            return true;
         /*if(num<=0)
            return false;
        while(num>0){
            if(num%2==0)
                num/=2;
            else if(num%3==0)
                num/=3;
            else if(num%5==0)
                num/=5;
            else if(num==1)
                break;
            else
                return false;
        }
        return true;*/
    }
}
