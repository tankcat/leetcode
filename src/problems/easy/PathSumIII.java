package problems.easy;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a binary tree in which each node contains an integer value.

 Find the number of paths that sum to a given value.

 The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

 The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

 Example:

 root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

 10
 /  \
 5   -3
 / \    \
 3   2   11
 / \   \
 3  -2   1

 Return 3. The paths that sum to 8 are:

 1.  5 -> 3
 2.  5 -> 2 -> 1
 3. -3 -> 11
 */
public class PathSumIII {
    int res = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        helper(root, sum);
        return res;

    }


    public void helper(TreeNode root, int sum) {
        if (root == null) return;
        if (sum - root.val == 0) res++;
        helper(root.left, sum-root.val);
        helper(root.right, sum-root.val);
    }

    public static void main(String[] args){
        TreeNode[] nodes=new TreeNode[9];
        int[] nums={10,5,-3,3,2,11,3,-2,1};
        for(int i=0;i<nums.length;i++){
            nodes[i]=new TreeNode(nums[i]);
        }
        nodes[0].left=nodes[1];
        nodes[0].right=nodes[2];
        nodes[1].left=nodes[3];
        nodes[1].right=nodes[4];
        nodes[2].left=null;
        nodes[2].right=nodes[5];
        nodes[3].left=nodes[6];
        nodes[3].right=nodes[7];
        nodes[4].left=null;
        nodes[4].right=nodes[8];
        nodes[5].left=null;
        nodes[5].right=null;
        nodes[6].left=null;
        nodes[6].right=null;
        nodes[7].left=null;
        nodes[7].right=null;
        nodes[8].left=null;
        nodes[8].right=null;
        PathSumIII obj=new PathSumIII();
        System.out.println(obj.pathSum(nodes[0],8));
    }
}
