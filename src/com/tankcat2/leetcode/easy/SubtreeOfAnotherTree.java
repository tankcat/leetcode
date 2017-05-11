package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-5-11.
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

 Example 1:
 Given tree s:

 3
 / \
 4   5
 / \
 1   2
 Given tree t:
 4
 / \
 1   2
 Return true, because t has the same structure and node values with a subtree of s.
 Example 2:
 Given tree s:

 3
 / \
 4   5
 / \
 1   2
 /
 0
 Given tree t:
 4
 / \
 1   2

 */
public class SubtreeOfAnotherTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuffer sb_s=new StringBuffer();
        StringBuffer sb_t=new StringBuffer();
        preTraverse(sb_s,s);
        preTraverse(sb_t,t);
        if(sb_s.toString().contains(sb_t.toString()))
            return true;
        else
            return false;
    }

    private void preTraverse(StringBuffer sb,TreeNode root){
        if(root==null) {
            sb.append(",null");
            return;
        }
        sb.append(","+root.val);
        preTraverse(sb,root.left);
        preTraverse(sb,root.right);
    }
}
