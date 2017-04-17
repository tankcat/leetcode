package com.tankcat2.leetcode.easy;

/**
 * Created by wxt on 2017/1/19.
 */
public class NumberComplement {
    public static void main(String[] args){
        NumberComplement nc=new NumberComplement();
        System.out.println(nc.findComplement(12));
    }
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        str=str.replace('0','1');
        int x= Integer.parseInt(str,2);
        return num^x;
    }

}
