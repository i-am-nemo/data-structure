package src.datastructure.tree;

public class BinaryTreeHeight {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		 
        /*create root*/
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(5);
        
	        System.out.println(height(tree.root));
	}

	private static int height(Node head) {
		if(head == null){
            return 0;
        }
        int leftHeight  = height(head.left);
        int rightHeight = height(head.right);
        return Math.max(leftHeight, rightHeight) + 1;
	}

}
