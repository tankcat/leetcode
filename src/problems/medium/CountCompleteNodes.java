package problems.medium;

import tools.TreeNode;

/**
 * Created by stream on 17-5-12.
 * Given a complete binary tree, count the number of nodes.

 Definition of a complete binary tree from Wikipedia:
 In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class CountCompleteNodes {

    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int hl=0;
        int hr=0;
        TreeNode l=root;
        TreeNode r=root;
        while(l!=null){
            hl++;
            l=l.left;
        }
        while(r!=null){
            hr++;
            r=r.right;
        }
        if(hl==hr)
            return (int)Math.pow(2,hl)-1;
        else
            return 1+countNodes(root.left)+countNodes(root.right);
    }
}
