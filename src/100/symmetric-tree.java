/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return dfs(root.left, root.right);
	}

	private boolean dfs(TreeNode left, TreeNode right) {
		if (left == null && right == null) { 
			return true; 
		} else if ((left == null && right != null) || (left != null && right == null)) {
			return false;
		}   

		if (left.val != right.val) {
			return false;
		}

		return dfs(left.left, right.right) && dfs(left.right, right.left);
	}   
}   

