public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p == null && q == null)
    		return true;
    	else if (p == null)
    		return false;
    	else if (q == null)
    		return false;
    	if(p.val == q.val) {
    		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    	}	
    	return false;
    }
    

    
    static public void main(String argv[]) {
    	TreeNode firstnode = new TreeNode(3);
    	TreeNode second = new TreeNode(2);
    	firstnode.left = second;
    	second.left = new TreeNode(5);
    	second.right = new TreeNode(2);
    	if(isSameTree(firstnode, firstnode.left))
    		System.out.println("True");
    }
}