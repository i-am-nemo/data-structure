package src.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(16);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(-3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(11);
		
		levelOrderTraversal(tree.root);
	}

	private static void levelOrderTraversal(Node root) {
		if(root == null)
			return;
		
		Queue<Node> list = new LinkedList<Node>();
		
		list.offer(root);
		
		while(list.size() > 0) {
			Node item = list.poll();
			System.out.println(item.key);
			
			if(item.left != null)
				list.offer(item.left);
			
			if(item.right != null)
				list.offer(item.right);
		}
	}

}
