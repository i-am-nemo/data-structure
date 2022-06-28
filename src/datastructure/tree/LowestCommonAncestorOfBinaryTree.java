package src.datastructure.tree;

public class LowestCommonAncestorOfBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.left.left = new Node(15);

		Node lca = findLca(tree.root, 10, 15);
		if (lca != null)
			System.out.println("LCA is = " + lca.key);
		else
			System.out.println("LCA not found");

	}

	private static Node findLca(Node root, int i, int j) {
		if (root == null)
			return null;

		if (root.key == i || root.key == j)
			return root;

		Node left = findLca(root.left, i, j);
		Node right = findLca(root.right, i, j);

		if (left != null && right != null)
			return root;

		return left != null ? left : right;
	}

}
