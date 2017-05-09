package com.tankcat2.leetcode.easy;

import java.util.*;

/**
 * Created by stream on 17-5-9.
 */
public class FindModeInBinarySearchTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    private HashMap<Integer,Integer> map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        func(root);
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return t1.getValue()-integerIntegerEntry.getValue();
            }
        });
        ArrayList<Integer> ret=new ArrayList<>();
        int minValue=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:list){
            if(entry.getValue()>=minValue) {
                ret.add(entry.getKey());
                minValue=entry.getValue();
            }
            else
                break;
        }
        int[] ret_arr=new int[ret.size()];
        for(int i=0;i<ret.size();i++)
            ret_arr[i]=ret.get(i);
        return ret_arr;
    }

    private void func(TreeNode root){
        if(root==null)
            return;
        if(map.containsKey(root.val))
            map.put(root.val,map.get(root.val)+1);
        else
            map.put(root.val,1);
        func(root.left);
        func(root.right);
    }
}
