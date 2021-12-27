package src.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversalReverse {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(16);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(-3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(11);

		levelByLevelTraversalReverse(tree.root);
	}

	private static void levelByLevelTraversalReverse(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();

		queue.offer(root);

		while (!queue.isEmpty()) {
			root = queue.poll();
			stack.push(root);

			if (root.right != null)
				queue.offer(root.right);

			if (root.left != null)
				queue.offer(root.left);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop().key);
		}
	}

}
