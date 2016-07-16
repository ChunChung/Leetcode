package practice.week2;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraversal {
	List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
 
		TreeNode curr = null;
		stack.push(root);

		while (stack.isEmpty() == false) {
			TreeNode temp = stack.peek();
			if (temp.left == null && temp.right == null) {
				list.add(temp.val);
				stack.pop();
			} else {
				if (temp.right != null) {
					stack.push(temp.right);
					temp.right = null;
				} 
				
				if (temp.left != null) {
					stack.push(temp.left);
					temp.left = null;
				}
			}
		}

		return list;
	}
	
	
	List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<TreeNode> traverse = new ArrayList<TreeNode>();

		
		TreeNode curr = null;
		traverse.add(root);

		while (traverse.isEmpty() == false) {
			curr = traverse.remove(traverse.size() - 1);
			if (curr != null) {
				list.add(curr.val);
				traverse.add(curr.left);
				traverse.add(curr.right);

			}
		}

		return list;
	}

	
    List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        TreeNode curr = root;
        
        while(curr != null) {
            if (curr.left == null) {
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode pre = curr.left;
                while(pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        
        return list;
    }
	
	
	
	static public void main(String argv[]) {
		TreeNode tree = new TreeNode(1);
		tree.right = new TreeNode(2);
		tree.right.left = new TreeNode(3);
		BinaryTreeTraversal BSTTraversal = new BinaryTreeTraversal();
		System.out.println(BSTTraversal.postorderTraversal(tree).toString());
	}
}