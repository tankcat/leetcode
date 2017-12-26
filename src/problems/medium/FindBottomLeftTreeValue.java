package problems.medium;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by stream on 17-5-12.
 * Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:

 2
 / \
 1   3

 Output:
 1
 Example 2:
 Input:

 1
 / \
 2   3
 /   / \
 4   5   6
 /
 7

 Output:
 7

 */
public class FindBottomLeftTreeValue {


    private ArrayList<ArrayList<Integer>> elements=new ArrayList<>();
    private LinkedList<TreeNode> queue=new LinkedList<>();
    public int findBottomLeftValue(TreeNode root) {
        widthTraverse(root);
        return elements.get(elements.size()-1).get(0);
    }

    private void widthTraverse(TreeNode root){
        int curLevel=1;
        int nextLevel=0;
        queue.add(root);
        ArrayList<Integer> list=new ArrayList<>();
        while(queue.size()!=0){
            TreeNode now=queue.remove();
            if(root==null)
                continue;
            list.add(now.val);
            curLevel--;
            if(now.left!=null) {
                queue.offer(now.left);
                nextLevel++;
            }
            if(now.right!=null) {
                queue.offer(now.right);
                nextLevel++;
            }
            if(curLevel==0){
                elements.add(list);
                list=new ArrayList<>();
                curLevel=nextLevel;
                nextLevel=0;
            }
        }
    }

    public TreeNode construct(){
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        node1.left=node2;
        node1.right=node3;
        node2.left=null;
        node2.right=null;
        node3.left=null;
        node3.right=null;
        return node1;
    }

    public static void main(String[] args){
        FindBottomLeftTreeValue obj=new FindBottomLeftTreeValue();
        System.out.println(obj.findBottomLeftValue(obj.construct()));

    }
}
