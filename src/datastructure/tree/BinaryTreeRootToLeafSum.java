package src.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRootToLeafSum {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(16);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(-3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(11);

		List<Node> result = new ArrayList<>();
		boolean r = rootToLeafSum(tree.root, 26, result);
		if (r) {
			result.forEach(node -> System.out.print(node.key + " "));
		} else {
			System.out.println("No path for sum " + 26);
		}
	}

	private static boolean rootToLeafSum(Node root, int sum, List<Node> result) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			if (root.key == sum) {
				result.add(root);
				return true;
			} else {
				return false;
			}
		}

		if (rootToLeafSum(root.left, sum - root.key, result) || rootToLeafSum(root.right, sum - root.key, result)) {
			result.add(root);
			return true;
		}
		return false;

	}

}
