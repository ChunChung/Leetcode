package LC230;

import utils.TreeNode;

/*
 [230] Kth Smallest Element in a BST  	

 https://leetcode.com/problems/kth-smallest-element-in-a-bst

 * algorithms
 * Medium (43.60%)
 * Total Accepted:    
 * Total Submissions: 

 Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 Note: 
 You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

 Follow up:
 What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

 Credits:Special thanks to @ts for adding this problem and creating all test cases.
 */

class LeetCode230 {
	private int index, kth;

	public int kthSmallest(TreeNode root, int k) {
		index = 0;
		kth = Integer.MAX_VALUE;
		inorder(root, k);
		return kth;
	}

	private void inorder(TreeNode root, int k) {
		if (root == null)
			return;

		inorder(root.left, k);

		index++;
		if (index == k) {
			kth = root.val;
		}

		if (index < k) {
			inorder(root.right, k);
		}
	}

}
