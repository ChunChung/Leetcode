package practice.week4;

import java.util.ArrayList;

public class TreeGeneration {
	private int index = 0;

	public GeneralTreeNode deserialize(String data) {
		// write your code here

		if (data == null || data.length() == 0) {
			return null;
		}
		GeneralTreeNode root = new GeneralTreeNode(data.charAt(index++));
		helper(root, data);
		return root;
	}

	private void helper(GeneralTreeNode root, String data) {
		if (index > data.length()) {
			return;
		}

		if (root.children == null) {
			root.children = new ArrayList<GeneralTreeNode>();
		}

		while (index < data.length()) {
			if (data.charAt(index) == ')') {
				index++;
				return;
			} else {
				GeneralTreeNode node = new GeneralTreeNode(data.charAt(index++));
				root.children.add(node);
				helper(node, data);
			}
		}
		return;
	}

	public static void main(String[] argv) {

		TreeGeneration obj = new TreeGeneration();
		obj.deserialize("ABE)F))C)DG)))");
	}
}