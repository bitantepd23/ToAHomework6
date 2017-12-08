import java.io.*;

public class BinarySearchTree {

	Node root;
	 public boolean keyFound = false;

	// return the height of the node to build the AVL tree
	int height(Node node) {
		// base case
		if (node == null) {
			return 0;
		}

		return node.height;
	}

	// balance the tree of the tree and its children
	int getBalance(Node n) {
		if (n == null) {
			return 0;
		}

		return height(n.left) - height(n.right);
	}

	// rotate right in a left left or left right instance
	Node rightRotate(Node NR) {
		Node x = NR.left;
		Node subtree = x.right;
		// System.out.println(x.key + " height: " + x.height);

		// System.out.print("Node: " + x.right.key + "is rotated to node: ");
		// rotate
		x.right = NR.left;
		// System.out.println(NR.left.key);
		subtree.left = subtree;

		// change the heights
		return x;

	}

	// rotate let in a right right or right left
	Node leftRotate(Node x) {
		Node y = x.right;
		Node subtree = y.left;

		// Perform rotation
		y.left = x;
		x.right = subtree;

		// Update heights
		int xl = height(x.left);
		int yl = height(y.left);
		int xr = height(x.right);
		int yr = height(y.right);

		x.height = Math.max(xl, xr) + 1;
		y.height = Math.max(yl, yl) + 1;

		// Return new root
		return y;
	}

	Node search(int searchVal, Node n) {
		if (n != null) {
			if (n.key == searchVal) {
				keyFound = true;
				foundNodePrint(n);
				return n;
			}
			Node foundNode = search(searchVal, n.left);
			if (foundNode == null) {
				foundNode = search(searchVal, n.right);
			}

			return foundNode;

		} else {

			return null;
		}

	}

	void foundNodePrint(Node n) {
		System.out.println("Found: " + n.key);

	}
	
	// create a binary serach tree
	Node insertNode(Node node, int insertValue) {
		// base case
		if (node == null) {
			return(new Node(insertValue));
		}
		
		// left node
		if (insertValue < node.key) {
			node.left = insertNode(node.left, insertValue);
		}
		// right node 
		else if (insertValue > node.key) {
			node.right = insertNode(node.right, insertValue);
		}
			return node;
	}
	

	// create a recursive function to insert
	// this function includes the building and execution of the AVL tree
	Node insertNodeAVL(Node node, int insertValue) {

		// base case
		if (node == null) {
			return (new Node(insertValue));
		}

		// insert the new insertValue
		// left node
		if (insertValue < node.key) {
			node.left = insertNodeAVL(node.left, insertValue);
		}
		// right node
		else if (insertValue > node.key) {
			node.right = insertNodeAVL(node.right, insertValue);
		} else {
			return node;
		}

		// get the height value of the right and left nodes
		int l = height(node.left);
		int r = height(node.right);

		// update the height of the ancestor node
		node.height = 1 + Math.max(l, r);

		int balance = getBalance(node);

		// if the node is unbalanced then balance it
		// thanks to geeksforgeeks.com for the help and understanding of this

		// left left case
		if (balance > 1 && insertValue < node.left.key) {
			return rightRotate(node);
		}

		// right right case
		if (balance < -1 && insertValue > node.right.key) {
			return leftRotate(node);

		}

		// left right case
		if (balance > 1 && insertValue > node.left.key) {
			return rightRotate(node);
		}

		// right left case
		if (balance < -1 && insertValue < node.right.key) {
			return leftRotate(node);
		}

		// then the tree is balanced
		return node;

	}

	// print the traversals

	// BST inorder
	void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.key + "  ");
			inOrder(node.right);
		}
	}

	// BST preorder
	void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.key + "  ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// BST postorder
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.key + "  ");
		}
	}

}