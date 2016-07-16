import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	static public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<TreeNode> traverse = new ArrayList<TreeNode>();

		
		TreeNode curr = null;
		traverse.add(root);

		while (traverse.isEmpty() == false) {
			curr = traverse.remove(traverse.size() - 1);
			if (curr != null) {
				list.add(curr.val);
				traverse.add(curr.right);
				traverse.add(curr.left);
			}
		}

		return list;
	}

	
	
	
	static public void main(String argv[]) {
		TreeNode tree = new TreeNode(1);
		tree.right = new TreeNode(2);
		tree.right.left = new TreeNode(3);
		System.out.println(preorderTraversal(tree).toString());
	}
}