package com.tankcat2.leetcode.medium;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by stream on 17-4-18.
 */
public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        return contains(nums,0,nums.length-1,target);
    }

    public boolean contains(int[] nums,int begin,int end,int target){
        if(begin>end)
            return false;
        if(nums==null||nums.length==0)
            return false;
        int mid=(begin+end)/2;
        if(nums[mid]==target)
            return true;
        else {
            int index=begin+1;
            while(index+1<nums.length&&nums[index]>=nums[index-1])
                index++;
            if(nums[begin]<=target&&nums[index-1]>=target)
                return contains2(nums,begin,index-1,target);
            else if(index<nums.length&&nums[index]<=target&&nums[end]>=target)
                return contains2(nums,index,end,target);
            else
                return false;
        }
    }

    public boolean contains2(int[] nums,int begin,int end,int target) {
        if (begin > end)
            return false;
        int mid=(begin+end)/2;
        if(nums[mid]==target)
            return true;
        else if(nums[mid]>target){
            return contains2(nums,begin,mid-1,target);
        }else
            return contains2(nums,mid+1,end,target);
    }
    public static void main(String[] args){
        int[] nums={4,5,6,7,0,1,2,3,4};
        int target=8;
        SearchInRotatedSortedArrayII obj=new SearchInRotatedSortedArrayII();
        System.out.println(obj.search(nums,target));
    }
}
