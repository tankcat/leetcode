package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-6-1.
 */
public class MinimumAbsoluteDifferenceInBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    private int minDifference=Integer.MAX_VALUE;
    int pre=-1;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraverse(root);
        return minDifference;
    }

    private void inOrderTraverse(TreeNode root){
        if(root==null)
            return;
        inOrderTraverse(root.left);
        if(pre!=-1){
            minDifference=Math.min(minDifference,root.val-pre);
        }
        pre=root.val;
        inOrderTraverse(root.right);
    }
}
