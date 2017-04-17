package com.tankcat2.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by stream on 17-3-31.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numbers.add(i+1);
        }
        for(int i=0;i<nums.length;i++){
            numbers.remove(nums[i]);
        }
        return new ArrayList<>(numbers);
    }

    public static void main(String[] args){
        int[] array={4,3,2,7,8,2,3,1};
        FindAllNumbersDisappearedInAnArray f=new FindAllNumbersDisappearedInAnArray();
        System.out.println(f.findDisappearedNumbers(array));
    }
}
