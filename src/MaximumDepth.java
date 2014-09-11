
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaximumDepth {
    public static int maxDepth(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) 
        	leftHeight = maxDepth(root.left);
        if (root.right != null)
        	rightHeight = maxDepth(root.right);
        
        if (leftHeight >= rightHeight)
        	return 1+leftHeight;
        else 
        	return 1+rightHeight;
    }
    

    
    static public void main(String argv[]) {
    	TreeNode firstnode = new TreeNode(3);
    	TreeNode second = new TreeNode(2);
    	firstnode.left = second;
    	second.left = new TreeNode(5);
    	second.right = new TreeNode(2);
    	System.out.println(maxDepth(firstnode));
    }
}

