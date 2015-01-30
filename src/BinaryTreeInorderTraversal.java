import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	static public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<TreeNode> traverse = new ArrayList<TreeNode>();

		
		TreeNode curr = root;
		
		if (curr != null) {
			while(curr!=null) {
				traverse.add(curr);
				curr = curr.left;
			}
		}
		

		while (traverse.isEmpty() == false) {
			curr = traverse.remove(traverse.size() - 1);
			list.add(curr.val);
			curr = curr.right;
			if (curr != null) {
				while(curr!=null) {
					traverse.add(curr);
					curr = curr.left;
				}
			}
		}

		return list;
	}

	static public void main(String argv[]) {
		TreeNode tree = new TreeNode(1);
		tree.right = new TreeNode(2);
		tree.right.left = new TreeNode(3);
		System.out.println(inorderTraversal(tree).toString());
	}
}