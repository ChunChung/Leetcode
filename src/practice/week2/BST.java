package practice.week2;

public class BST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.val = data;
		}
	}

	public TreeNode delete(TreeNode root, int target) {
		if (root == null) {
			return null;
		}
		TreeNode runningNode = root;
		TreeNode parent = null;
		TreeNode node = null;
		boolean isLeft = false;
		while (runningNode != null) {
			if (runningNode.val == target) {
				node = runningNode;
			} else if (runningNode.val > target) {
				parent = runningNode;
				runningNode = runningNode.left;
				isLeft = true;
			} else {
				parent = runningNode;
				runningNode = runningNode.right;
				isLeft = false;
			}
		}

		if (node != null) {
			if (node.left == null && node.right == null) {
				if (parent.left == node) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left == null) {
				parent.right = node.right;
			} else if (node.right == null) {
				parent.left = node.left;
			} else {
				TreeNode child = node.right;
				while (child.left != null) {
					child = child.left;
				}
				child.left = node.left;

				if (isLeft) {
					parent.left = child;
				} else {
					parent.right = child;
				}
			}
		}
		return root;
	}

	public TreeNode add(TreeNode head, int n) {
		TreeNode node = new TreeNode(n);
		if (head == null) {
			return node;
		}
		TreeNode previous = head;;
		TreeNode running = head;
		while (running != null) {
			previous = running;
			if (running.val >= n) {
				running = running.left;
			} else {
				running = running.right;
			}
		}
		if (previous.val >= n) {
			previous.left = node;
		} else {
			previous.right = node;
		}
		return head;

	}

	public void main(String[] argv) {
		TreeNode head = new TreeNode(0);

		return;
	}

}