package com.tankcat2.leetcode.easy;

import java.util.ArrayList;


/**
 * Created by stream on 17-4-25.
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

 Note:

 All letters in hexadecimal (a-f) must be in lowercase.
 The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 The given number is guaranteed to fit within the range of a 32-bit signed integer.
 You must not use any method provided by the library which converts/formats the number to hex directly.
 Example 1:

 Input:
 26

 Output:
 "1a"
 Example 2:

 Input:
 -1

 Output:
 "ffffffff"
 */
public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if(num==0)
            return "0";
        if(num==Integer.MIN_VALUE)
            return "80000000";
        if(num>0)
            return processPossitive(num);
        else
            return processNegtive(0-num);
    }

    private String processNegtive(int num) {
        ArrayList<Integer> ret=new ArrayList<>();
        while(num>0){
            ret.add(num%16);
            num/=16;
        }
        int c=1;
        for(int i=0;i<ret.size();i++){
            ret.set(i,(15-ret.get(i)+c)%16);
            c=(15-ret.get(i)+c)/16;
        }
        StringBuffer sb=new StringBuffer();
        for(Integer inter:ret){
            if(inter>9)
                sb.append((char)('a'+inter-10));
            else
                sb.append((char)('0'+inter));
        }
        int gap=0;
        if(ret.size()<8)
            gap=8-ret.size();
        for(int i=0;i<gap;i++)
            sb.append('f');
        sb.reverse();
        return sb.toString();
    }

    private String processPossitive(int num){
        ArrayList<Character> ret=new ArrayList<>();
        while(num>0){
            int a=num%16;
            if(a<10)
                ret.add((char)('0'+a));
            else
                ret.add((char)('a'+a-10));
            num/=16;
        }
        StringBuffer sb=new StringBuffer();
        for(char c:ret)
            sb.append(c);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args){
        ConvertANumberToHexadecimal obj=new ConvertANumberToHexadecimal();
        System.out.println(obj.toHex(-2147483648));
    }
}
