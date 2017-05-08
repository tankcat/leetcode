package com.tankcat2.leetcode.medium;

/**
 * Created by stream on 17-5-8.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 Example 1:
 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {
    //Haven't reach to O(log(m+n))
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] nums=new int[len1+len2];
        int i=0,j=0;
        int index=0;
        while(i<len1&&j<len2){
            if(nums1[i]<nums2[j]){
                nums[index++]=nums1[i];
                i++;
            }else{
                nums[index++]=nums2[j];
                j++;
            }
        }
        while(i<len1){
            nums[index++]=nums1[i];
            i++;
        }
        while(j<len2){
            nums[index++]=nums2[j];
            j++;
        }
        if(nums.length%2==1)
            return nums[nums.length/2];
        else
            return (nums[nums.length/2]+nums[nums.length/2-1])/2.0;
    }

    public static void main(String[] args){
        MedianOfTwoSortedArrays obj=new MedianOfTwoSortedArrays();
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(obj.findMedianSortedArrays(nums1,nums2));
    }
}
