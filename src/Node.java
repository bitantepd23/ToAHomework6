public class Node {

	//	protected Node<E> leftNode, rightNode;
	// 	E data;
	// boolean isVisited;
	
	int key, height;
	Node left, right;

	Node(int d) {
		key = d;
		height = 1;
	}
	
	/*
	public Node(E data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
		this.isVisited = false;
	}
	
	
	public void insert(E value) {
		
		boolean insertLeftChild; // alternates so the node can be 
		
		if ((Integer) value < (Integer) this.data) {
			insertLeftChild = true;
		}
		else {
			insertLeftChild = false;
		}
		
		if (insertLeftChild == true) {
			if (this.leftNode == null)
				this.leftNode = new Node<E>(value);
			else 
				leftNode.insert(value);
		}
		else {
			if (this.rightNode == null)
				this.rightNode = new Node<E>(value);
			else
				rightNode.insert(value);
		}
	}
	*/
	
	
}
