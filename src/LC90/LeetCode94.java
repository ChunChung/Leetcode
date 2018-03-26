package LC90;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import utils.TreeNode;

/*
[94] Binary Tree Inorder Traversal  	

https://leetcode.com/problems/binary-tree-inorder-traversal

* algorithms
* Medium (46.27%)
* Total Accepted:    
* Total Submissions: 

Given a binary tree, return the inorder traversal of its nodes' values.


For example:
Given binary tree [1,null,2,3],

   1
    \
     2
    /
   3



return [1,3,2].


Note: Recursive solution is trivial, could you do it iteratively?
*/

class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (null == root) {
            return result; 
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(null != root) {
            stack.push(root);
            root = root.left;
        }
        
        while(stack.size() > 0) {
            root = stack.pop();
            result.add(root.val);
            root = root.right;  
            while(null != root) {
                stack.push(root);
                root = root.left;
            } 
        }
        return result;   
    }
}
