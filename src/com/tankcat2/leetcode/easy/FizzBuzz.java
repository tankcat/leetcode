package com.tankcat2.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxt on 2017/1/19.
 */
public class FizzBuzz {
    public static void main(String[] args){
        FizzBuzz fb=new FizzBuzz();
        System.out.print(fb.fizzBuzz(16));
    }
    public List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5!=0){
                result.add("Fizz");
            }else if(i%3!=0&&i%5==0){
                result.add("Buzz");
            }else if(i%3==0&&i%5==0){
                result.add("FizzBuzz");
            }else
                result.add(i+"");
        }
        return result;
    }
}
