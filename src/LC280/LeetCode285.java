package LC280;

import utils.TreeNode;

/*
Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.

*/


public class LeetCode285{
// Method 1
    private TreeNode rightSmallest = null;
    private boolean foundParent = false;
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorderTraversal(root, p);
        return rightSmallest;
    }
    
    private void inorderTraversal(TreeNode root, TreeNode p) {
        if (null == root || rightSmallest != null) return;
                       
        inorderTraversal(root.left, p);
               
        if (root == p) {
            // find right smallest using inorderTraversal
            foundParent = true;
        } 
        
        if (foundParent && rightSmallest == null && root != p) {
            rightSmallest = root;
            return;
        } 
                
        inorderTraversal(root.right, p);     
        return;        
    }

    
// Method 2   
//    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//        TreeNode res = null;
//        while(root!=null) {
//            if(root.val > p.val) {
//            	res = root;
//            	root = root.left;
//            }
//            else root = root.right;
//        }
//        return res;
//    }
}