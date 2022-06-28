package src.datastructure.tree;

public class IsATreeBinarySearchTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(15);
		tree.root.left.right = new Node(8);
		tree.root.left.left = new Node(2);
		tree.root.right.right = new Node(18);
		tree.root.right.left = new Node(12);

		boolean result = isBst(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if(result)
			System.out.println("It is a BST");
		else
			System.out.println("It is not a BST");
	}

	private static boolean isBst(Node root, int minValue, int maxValue) {

		if (root == null)
			return true;

		if (root.key < minValue || root.key > maxValue) {
			return false;
		}
			
		return isBst(root.left, minValue, root.key) && isBst(root.right, root.key, maxValue);
	}

}
