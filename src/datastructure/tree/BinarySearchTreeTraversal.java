package src.datastructure.tree;

public class BinarySearchTreeTraversal {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		System.out.println("Print inorder :");
		inorder(tree.root);

		System.out.println("\nPrint preorder :");
		preorder(tree.root);
		
		System.out.println("\nPrint postorder :");
		postorder(tree.root);
	}

	private static void preorder(Node root) {

		if (root == null)
			return;

		System.out.print(root.key + " ");
		preorder(root.left);
		preorder(root.right);
	}

	private static void postorder(Node root) {

		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " ");
	}

	private static void inorder(Node root) {

		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	}

}
