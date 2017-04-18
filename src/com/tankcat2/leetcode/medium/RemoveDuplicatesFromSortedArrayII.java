package com.tankcat2.leetcode.medium;

/**
 * Created by stream on 17-4-18.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int num:nums){
            if(i<2||num>nums[i-2])
                nums[i++]=num;
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums={1,1,1,1,3,3};
        RemoveDuplicatesFromSortedArrayII obj=new RemoveDuplicatesFromSortedArrayII();
        int len=obj.removeDuplicates(nums);
        for(int i=0;i<len;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }
}
