package src.datastructure.tree;

public class LowestCommonAncestorOfBST {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(15);
		tree.root.left.right = new Node(8);
		tree.root.left.left = new Node(2);
		tree.root.right.right = new Node(18);
		tree.root.right.left = new Node(12);

		Node lca = findLCA(tree.root, 12, 18);
		if (lca == null)
			System.out.println("no lca found");
		else
			System.out.println("LCA is = " + lca.key);
	}

	private static Node findLCA(Node root, int i, int j) {
		if (root.key > Math.max(i, j))
			return findLCA(root.left, i, j);
		else if (root.key < Math.min(i, j))
			return findLCA(root.right, i, j);
		return root;

	}

}
