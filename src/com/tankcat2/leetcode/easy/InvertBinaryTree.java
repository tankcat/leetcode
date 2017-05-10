package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-5-10.
 */
public class InvertBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root){
        if(root==null)
            return;
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        invert(root.left);
        invert(root.right);
    }
}
