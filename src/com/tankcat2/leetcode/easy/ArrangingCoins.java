package com.tankcat2.leetcode.easy;

import java.util.ArrayList;

/**
 * Created by stream on 17-4-24.
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

 Given n, find the total number of full staircase rows that can be formed.

 n is a non-negative integer and fits within the range of a 32-bit signed integer.

 Example 1:

 n = 5

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤

 Because the 3rd row is incomplete, we return 2.
 Example 2:

 n = 8

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤ ¤
 ¤ ¤

 Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int index=1;
        while(list.get(index-1)<=n){
            int value=list.get(index-1)+index+1;
            list.add(value);
            index++;
            //System.out.println(index+" : "+value);
            if(value<0)
                break;
        }
        return index-1;
    }

    public static void main(String[] args){
        ArrangingCoins obj=new ArrangingCoins();
        System.out.print(obj.arrangeCoins(2147483647));
    }
}
