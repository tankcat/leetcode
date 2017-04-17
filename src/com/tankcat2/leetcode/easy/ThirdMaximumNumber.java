package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-10.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int[] tmp = new int[3];
        tmp[0]=nums[0];
        int min=0;
        int middle=1;
        int max=2;
        int i=0;
        while(i<nums.length&&nums[i]==tmp[min]){
            i++;
        }
        if(i==nums.length)
            return tmp[min];
        tmp[1]=nums[i];
        if(nums[i]<tmp[min]){
            middle=0;
            min=1;
        }
        while(i<nums.length&&(nums[i]==tmp[min]||nums[i]==tmp[middle])){
            i++;
        }
        if(i==nums.length)
            return tmp[middle];
        tmp[2]=nums[i];
        if(nums[i]<tmp[min]){
            max=middle;
            middle=min;
            min=2;
        }else if(nums[i]<tmp[middle]){
            max=middle;
            middle=2;
        }
        for(;i<nums.length;i++){
            if(nums[i]<=tmp[min]||nums[i]==tmp[middle]||nums[i]==tmp[max])
                continue;
            tmp[min] = nums[i];
            if(nums[i]>tmp[max]) {
                int index=max;
                max=min;
                min=middle;
                middle=index;
            }else if(nums[i]>tmp[middle]){
                    int index=middle;
                    middle=min;
                    min=index;

            }
        }
        return tmp[min];
    }

    public static void main(String[] args){
        ThirdMaximumNumber tmn=new ThirdMaximumNumber();
        int[] nums={5,2,4,1,3,6,0};
        System.out.println(tmn.thirdMax(nums));
    }
}
