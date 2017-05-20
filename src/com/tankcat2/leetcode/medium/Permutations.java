package com.tankcat2.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stream on 17-5-20.
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class Permutations {

    private List<List<Integer>> ret= new ArrayList<List<Integer>>();
    private List<Integer> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        func(nums,0,nums.length);
        return ret;
    }

    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    private void func(int[] nums,int st,int len){
        if(st==len-1){
            for(int i=0;i<len;i++){
                list.add(nums[i]);
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            ret.add(list);
            list=new ArrayList<>();
        }else{
            for(int i=st;i<len;i++){
                swap(nums,st,i);
                func(nums,st+1,len);
                swap(nums,st,i);
            }
        }
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4};
        Permutations obj=new Permutations();
        obj.permute(nums);
        for(List<Integer> list:obj.ret){
            System.out.println(list);
        }
    }

}
