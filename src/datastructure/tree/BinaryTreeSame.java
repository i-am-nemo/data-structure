package src.datastructure.tree;

public class BinaryTreeSame {

	public static void main(String[] args) {
		BinaryTree tree1 = new BinaryTree();

		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.left.left = new Node(5);

		BinaryTree tree2 = new BinaryTree();

		tree2.root = new Node(1);
		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.left.left = new Node(6);

		boolean result = sameTree(tree1.root, tree2.root);
		if(result)
			System.out.println("Same tree");
		else
			System.out.println("Not same");
	}

	private static boolean sameTree(Node root1, Node root2) {
		if(root1 == null && root2 == null){
            return true;
        }
		
		if (root1 == null || root2 == null)
			return false;

		return (root1.key == root2.key) && sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
	}

}
