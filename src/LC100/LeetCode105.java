package LC100;

import utils.TreeNode;

/*

[105] Construct Binary Tree from Preorder and Inorder Traversal  	

https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal

* algorithms
* Medium (32.03%)
* Total Accepted:    
* Total Submissions: 

Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given


preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]

Return the following binary tree:


    3
   / \
  9  20
    /  \
   15   7

*/

class LeetCode105{
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	return helper(preorder, inorder, 0, preorder.length-1);
    }
}