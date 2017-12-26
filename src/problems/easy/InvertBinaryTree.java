package problems.easy;

import tools.TreeNode;

/**
 * Created by stream on 17-5-10.
 */
public class InvertBinaryTree {

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
