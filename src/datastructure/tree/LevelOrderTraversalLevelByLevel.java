package src.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLevelByLevel {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(16);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(-3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(11);

		levelByLevelTraversal(tree.root);
	}

	private static void levelByLevelTraversal(Node root) {
		if (root == null)
			return;

		Queue<Node> list = new LinkedList<Node>();

		list.offer(root);
		list.offer(null);

		while (!list.isEmpty()) {
			Node temp = list.poll();
			if (temp != null) {
				System.out.print(temp.key + " ");
				if (temp.left != null) {
					list.offer(temp.left);
				}
				if (temp.right != null)
					list.offer(temp.right);
			} else {
				if (!list.isEmpty()) {
					list.offer(null);
					System.out.println();
				}

			}
		}
	}

}
