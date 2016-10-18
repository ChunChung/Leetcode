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

        Queue leftQueue = new ArrayList();
        Queue rightQueue = new ArrayList();

        leftQueue.offer(root.left);
        rightQueue.offer(root.right);
        return bfs(leftQueue, rightQueue);
    }

    private boolean bfs(Queue leftQueue, Queue rightQueue) {
        if (leftQueue.size() == 0 && rightQueue.size() == 0) {
            return true;
        }

        if (leftQueue.size() != rightQueue.size()) {
            return false;
        }

        TreeNode nullNode = new TreeNode(-1);
        int n = leftQueue.size();

        while (n > 0) {
            n--;
        }
        return bfs(leftQueue, rightQueue);
    }
}
