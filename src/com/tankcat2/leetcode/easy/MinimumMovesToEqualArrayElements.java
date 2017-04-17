package com.tankcat2.leetcode.easy;

import java.util.Arrays;

/**
 * Created by stream on 17-4-15.
 */
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int minValue=nums[0];
        int sum=minValue;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<minValue){
                minValue=nums[i];
            }
        }
        return sum-minValue*nums.length;
    }

    public int minMoves2(int[] nums) {
        int ret=0;
        int len=nums.length;
        Arrays.sort(nums);
        int median=nums.length%2==0?(nums[len/2]+nums[len/2-1])/2:nums[len/2];
        for(int num:nums)
            ret+=Math.abs(median-num);
        return ret;
    }

    public static void main(String[] args){
        int[] nums={1,1,2};
        MinimumMovesToEqualArrayElements obj=new MinimumMovesToEqualArrayElements();
        System.out.println(obj.minMoves2(nums));
    }
}
