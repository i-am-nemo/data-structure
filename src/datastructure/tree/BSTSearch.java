package src.datastructure.tree;

public class BSTSearch {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		boolean result = search(tree.root, 80);
		if(result)
			System.out.println("Item found");
		else
			System.out.println("Item not found");
	}

	private static boolean search(Node root, int item) {
		if(root == null)
			return false;
		
		if(root.key == item) {
			return true;
		}
		else if(root.key > item) {
			return search(root.left, item);
		}
		else {
			return search(root.right, item);
		}
	}

}
