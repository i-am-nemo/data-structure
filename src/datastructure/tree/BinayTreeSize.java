package src.datastructure.tree;

public class BinayTreeSize {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		/* create root */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.left = new Node(5);

		System.out.println(treeSize(tree.root));
	}

	private static int treeSize(Node root) {
		if (root == null)
			return 0;

		else
			return treeSize(root.left) + treeSize(root.right) + 1;
	}

}
