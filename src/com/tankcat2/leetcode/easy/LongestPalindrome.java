package com.tankcat2.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stream on 17-3-31.
 */
public class LongestPalindrome {
    public static void main(String[] args){
        LongestPalindrome lp=new LongestPalindrome();
        System.out.println(lp.longestPalindrome("bb"));
    }
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> counter=new HashMap<>();
        for(char c:s.toCharArray()){
            if(counter.containsKey(c))
                counter.put(c,counter.get(c)+1);
            else
                counter.put(c,1);
        }
        int odd=0;
        int result=0;
        for(Map.Entry<Character,Integer> entry:counter.entrySet()){
            int count=entry.getValue();
            if(count%2==0)
                result+=count;
            else{
                odd++;
                result+=(count-1);
            }
        }
        if(odd>=1)
            result++;
        return result;
    }

}
