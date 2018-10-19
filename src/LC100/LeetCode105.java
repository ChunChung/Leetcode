
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
        return helper(preorder, inorder, 0, 0, preorder.length -1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int inorderStart, int preorderStart, int inorderEnd) {
        if(preorder == null || inorderStart > inorderEnd || inorderEnd > preorder.length - 1) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[preorderStart]);

        int inorderIndex = 0;
        for(;inorderIndex <= inorderEnd; inorderIndex++) {
            if (preorder[preorderStart] == inorder[inorderIndex]) {
                break;
            }
        }

        node.left = helper(preorder, inorder, inorderStart, preorderStart + 1, inorderIndex - 1);
        node.right = helper(preorder, inorder, inorderIndex + 1, preorderStart + inorderIndex - inorderStart + 1,inorderEnd);
        return node;
    }
}