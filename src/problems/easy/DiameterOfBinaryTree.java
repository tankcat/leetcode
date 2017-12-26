package problems.easy;

import tools.TreeNode;

/**
 * Created by stream on 17-4-27.
 */
public class DiameterOfBinaryTree {


    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        else {
            int dia= getLength(root.left) + getLength(root.right) + 2;
            int ldia=diameterOfBinaryTree(root.left);
            int rdia=diameterOfBinaryTree(root.right);
            return Math.max(dia,Math.max(ldia,rdia));
        }
    }

    private int getLength(TreeNode root){
        if(root==null)
            return 0;
        else{
            int left=getLength(root.left);
            int right=getLength(root.right);
            return Math.max(left,right)+1;
        }
    }
}
