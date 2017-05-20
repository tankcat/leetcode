package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-5-20.
 */
public class SumOfLeftLeaves {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    private int ret=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
            return 0;
        func(root.left,true);
        func(root.right,false);
        return ret;
    }

    private void func(TreeNode root,boolean isLeft){
        if(root==null)
            return;
        if(root.left==null&&root.right==null&&isLeft==true)
            ret+=root.val;
        func(root.left,true);
        func(root.right,false);
    }
}
