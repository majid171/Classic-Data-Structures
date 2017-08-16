
public class BinarySearchTree{
	
	public class Node{
		
		private int data;
		private Node left, right;
		
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
	} // End of inner class Node
	
	private Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public int size(){
		return size(root);
	}
	
	private int size(Node root){
		if (root == null) 
			return 0;
		else
			return 1 + size(root.left) + size(root.right);
	}
	
	public int height(){
		return height(root);
	}
	
	private int height(Node tree){
		if (tree == null)
			return -1;
		else
			return 1 + Math.max(height(tree.left), height(tree.right));
	}
	
	public void postOrder(){
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node root){
		if (root.left != null) inOrder(root.left);
		if (root.right != null) inOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public void preOrder(){
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node root){
		System.out.print(root.data + " ");
		if (root.left != null){
			inOrder(root.left);
		}
		if (root.right != null){
			inOrder(root.right);
		}
	}
	
	public void inOrder(){
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node root){
		if (root.left != null) inOrder(root.left);
		System.out.print(root.data + " ");
		if (root.right != null) inOrder(root.right);
	}
	
	public void insert(int data){
		root = insert(root, data);
	}
	
	private Node insert(Node root, int data){
		
		if (root == null){
			root = new Node(data);
		}
		else if(data < root.data){
			root.left = insert(root.left, data);
		}
		else if(data > root.data){
			root.right = insert(root.right, data);
		}
		else{
			System.out.println("Node already exists");
		}
		return root;
	}
	
	public Node treeMax(Node tree){
		while(tree.right != null){
			tree = tree.right;
		}
		return tree;
	}
	
	public Node treeMin(Node tree){
		while(tree.left != null){
			tree = tree.left;
		}
		return tree;
	}
	
	public Node treeSearch(int data){
		return treeSearch(root, data);
	}
	
	private Node treeSearch(Node tree, int data){
		if (tree == null || data == tree.data){
			return tree;
		}
		else if(data < tree.data){
			return treeSearch(tree.left, data);
		}
		else{
			return treeSearch(tree.right, data);
		}
	}
	
}