import java.io.*;

public class BinarySearchTree<E> {

	protected Node<E> root;
	
	public BinarySearchTree(){
		
		this.root = null;
		
	}
	
	public BinarySearchTree(Node<E> root){
		
		this.root = root;
		
	}
	
	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree){
		
		this.root = new Node<E>(data);
		
		if (leftTree != null){
			root.leftNode = leftTree.root;
		}
		if (rightTree != null){
			root.rightNode = rightTree.root;
		}
		
	}
	
	public void insertNode(E insertValue){
		
		if (this.root == null){
			this.root = new Node<E> (insertValue);
		}
		else {
			this.root.insert(insertValue);
		}
	}
	
	public BinarySearchTree<E> getLeftTree(){
		
		if (this.root != null && root.leftNode != null){
			return new BinarySearchTree<E>(root.leftNode);
		}
		else {
			return null;
		}
	}
	
	public BinarySearchTree<E> getRightTree(){
		
		if (this.root != null && root.rightNode != null){
			return new BinarySearchTree<E>(root.rightNode);
		}
		else {
			return null;
		}
	}
	
	public Node<E> search(Node<E> root, E keyData) {
		
		if (root == null) {
			System.out.println(keyData+" was not found in this tree.");
			return root;
		}
		
		if (root.data == keyData) {
			System.out.println(keyData+" was found in this tree.");
			return root;
		}
		
		else if (root.leftNode != null && root.rightNode != null) {
		// if key is less than current root
		if ((Integer) root.data > (Integer) keyData)
			return search(root.leftNode, keyData);
		
		// if key is greater than current root
		if ((Integer) root.data < (Integer) keyData)
			return search(root.rightNode, keyData);
		}
		
		return search(root.rightNode, keyData);

	}
	
	public void searchResponse(boolean searchStatement) {
		
		if (searchStatement == true) {
			System.out.println("Value exists in tree.");
			
		}
			
	}
	public String getInOrderTraversal (BinarySearchTree<E> tree){
		
		if (tree == null){
			return "";
		}
		else {
			return (getInOrderTraversal(tree.getLeftTree())+
					tree.root.data.toString()+" "+
					getInOrderTraversal(tree.getRightTree()));
		}
	}
	
	public String getPreOrderTraversal(BinarySearchTree<E> tree){
		
		if (tree == null){
			return "";
		}
		
		else {
			return (tree.root.data.toString()+" "+
					getPreOrderTraversal(tree.getLeftTree())+
					getPreOrderTraversal(tree.getRightTree()));
		}		
	}
	
	public String getPostOrderTraversal(BinarySearchTree<E> tree){
		
		if (tree == null){
			return "";
		}
		
		else {
			return (getPostOrderTraversal(tree.getLeftTree())+
					getPostOrderTraversal(tree.getRightTree())+
					tree.root.data.toString()+" ");
		}
		
	}
}