package LC100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.TreeNode;

/*
[103] Binary Tree Zigzag Level Order Traversal  	

https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal

* algorithms
* Medium (34.28%)
* Total Accepted:    
* Total Submissions: 

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).


For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7



return its zigzag level order traversal as:

[
  [3],
  [20,9],
  [15,7]
]
*/

class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> results = new ArrayList();
    	if (root == null) {
    		return results;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	
    	boolean reverse = false;
    	
    	while (queue.size() != 0) {
    		int n = queue.size();
    		List<Integer> row = new ArrayList<Integer>();
    		while (n > 0) {
    			TreeNode node = queue.poll();
    			row.add(node.val);
    			
    			if(node.left != null) 
    				queue.add(node.left);
    			if(node.right != null) 
    				queue.add(node.right);
    		}
    		
    		if (reverse) {
    			Collections.reverse(row);
    		} 
			results.add(row);
			reverse = reverse ^ true;
    	}
    	
    	
    	return results;        
    }
}


