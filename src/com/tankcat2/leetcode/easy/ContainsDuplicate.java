package com.tankcat2.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stream on 17-4-1.
 */
public class ContainsDuplicate {
    public static void main(String[] args){

    }
    public boolean containsDuplicate(int[] nums){
        boolean flag=false;
        Set<Integer> num_set=new HashSet<>();
        for(int num:nums){
            if(num_set.contains(num))
                flag=true;
            else
                num_set.add(num);
        }
        return flag;
    }
}
