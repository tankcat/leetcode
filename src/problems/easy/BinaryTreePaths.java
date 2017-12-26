package problems.easy;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stream on 17-5-10.
 * Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 1
 /   \
 2     3
 \
 5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {

    private List<String> ret=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null)
            findPaths(root,String.valueOf(root.val));
        return ret;
    }

    private void findPaths(TreeNode root, String path){
        if(root.left==null&&root.right==null)
            ret.add(path);
        if(root.left!=null)
            findPaths(root.left,path+"->"+root.left.val);
        if(root.right!=null)
            findPaths(root.right,path+"->"+root.right.val);
    }
}
