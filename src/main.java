import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// get the input from the user for the key search
		Scanner input = new Scanner(System.in);

		// Heap
		System.out.println("********** Heap **********");
		Heap heap = new Heap();
		System.out.println("\nInitialized Heap");
		heap.printHeap();
		System.out.println("\nPost HeapSort");
		heap.heapSort();
		heap.printHeap();

		int[] testArray = { 58, 288, 358, 468, 640, 694, 697, 728, 832, 860, 1379, 1397, 1479, 1488, 1492, 1531, 1676,
				1731, 1853, 1872, 1879, 1992, 2293, 2386, 2570, 2748, 3031, 3059, 3163, 3194, 3292, 3433, 3581, 3586,
				3975, 3990, 3996, 4155, 4174, 4209, 4237, 4497, 4541, 4672, 4719, 5139, 5227, 5275, 5290, 5441, 5544,
				5603, 5745, 5815, 5818, 6257, 6279, 6339, 6425, 6465, 6502, 6505, 6567, 6623, 6645, 6733, 6734, 6806,
				6924, 6933, 6938, 7080, 7224, 7275, 7396, 7397, 7616, 7742, 7826, 7832, 7928, 8192, 8223, 8319, 8408,
				8419, 8547, 9001, 9032, 9120, 9182, 9310, 9314, 9338, 9355, 9511, 9512, 9529, 9772, 9854 };

		
		Heap testHeap = new Heap(testArray);
		System.out.println("\n  Initialized Test Heap");
		testHeap.heapSort();
		testHeap.printHeap();
		testHeap.remove(54);
		System.out.println("\n  Post removal");
		testHeap.printHeap();

		System.out.println("***************************");
		System.out.println();
		System.out.println();

		System.out.println("************** BST **************");

		
		BinarySearchTree t = new BinarySearchTree();
		

		System.out.println("Binary Search tree ");
		  t.root = t.insertNode(t.root, 1); 
		  t.root = t.insertNode(t.root, 3); 
		  t.root = t.insertNode(t.root, 2);
		  t.root = t.insertNode(t.root, 4);
		  t.root = t.insertNode(t.root, 5);
		  t.root = t.insertNode(t.root, 10);
		  t.root = t.insertNode(t.root, 17); 
		  t.root = t.insertNode(t.root, 40);
		  t.root = t.insertNode(t.root, 65);
		  
		  System.out.println("Enter a value to find ");
			int keyToFind = input.nextInt();

			t.search(keyToFind, t.root);
			if (t.keyFound == false) {
				System.out.println(keyToFind + " was not found.");

			}
		  
		  System.out.println("Inorder traversal of the BST Tree ");
			t.inOrder(t.root);
			System.out.println();
			
			//******************* AVL TREE ************
			
			//System.out.println(testArray.length);
			for (int i = 0; i < 10; i++) {
				//t.root = t.insertNodeAVL(t.root, testArray[i]);
			}
			
			// only works when the input array is length 10
			int[] ta = { 10, 20, 13, 234, 123, 3453, 345, 1256 };
			
			for (int i = 0; i < ta.length -1; i++) {
			//	t.root = t.insertNodeAVL(t.root, ta[i]);
			}
		 

		// find the entered key

		

		System.out.println("Inorder traversal of the AVL Tree ");
		t.inOrder(t.root);
		System.out.println();

		System.out.println("PostOrder taversal of the AVL Tree");
		t.postOrder(t.root);
		System.out.println();

		System.out.println("PreOrder traversal of the AVL Tree");
		t.preOrder(t.root);
		System.out.println();

		System.out.println("*********************************");

	}

}
