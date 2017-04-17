package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-7.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n){
        return (n>0&&Math.pow(3,20)%n==0);
    }
    public static void main(String[] args){
        PowerOfThree pot=new PowerOfThree();
        System.out.println(pot.isPowerOfThree(9));
    }
}
