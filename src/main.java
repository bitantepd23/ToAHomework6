import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Heap heap = new Heap();
		BinarySearchTree<Integer> bstObj = new BinarySearchTree<>();
	
		bstObj.insertNode(100);
		bstObj.insertNode(122);
		bstObj.insertNode(77);
		bstObj.insertNode(79);
		bstObj.insertNode(188);
		bstObj.insertNode(12);
		bstObj.insertNode(102);
		bstObj.insertNode(99);
		bstObj.search(bstObj.root, 12);
//		Random randGen = new Random();
//		System.out.println("Original Tree:");
//		for (int i=0; i<100; i++) {
//			Integer rand = new Integer(randGen.nextInt());
//			System.out.print(rand+" ");
//			randHeap.insertNode(rand);
//		}
		
		System.out.println("\n InOrder Traversal");
		System.out.println(bstObj.getInOrderTraversal(bstObj));
		System.out.println("\n Pre-Order Traversal");
		System.out.println(bstObj.getPreOrderTraversal(bstObj));
		System.out.println("\n Post-Order Traversal");
		System.out.println(bstObj.getPostOrderTraversal(bstObj));
		
		
		System.out.println("\nInitialized Heap");
		heap.printHeap();
		System.out.println("\nPost HeapSort");
		heap.heapSort();
		heap.printHeap();
		
		int[] testArray = {88, 685, 98, 741, 532, 676, 305, 237, 811, 785, 289, 382, 918, 640, 100, 24, 682, 252, 772, 439, 580, 797, 210, 579, 413, 777, 981, 441, 609, 578, 736, 477, 626, 397, 780, 530, 721, 146, 69, 64, 468, 229, 225, 801, 899, 207, 746, 240, 13, 425, 37, 966, 959, 487, 995, 178, 836, 245, 101, 829, 297, 953, 492, 791, 319, 652, 150, 761, 131, 862, 765, 352, 602, 69, 665, 162, 742, 82, 54, 241, 278, 384, 56, 105, 465, 617, 731, 968, 851, 7, 399, 761, 320, 164, 248, 20, 285, 943, 891, 942, 
};
		Heap testHeap = new Heap(testArray);
		System.out.println("\n  Initialized Test Heap");
		testHeap.heapSort();
		testHeap.printHeap();
		testHeap.remove(54);
		System.out.println("\n  Post removal");
		testHeap.printHeap();
		
	}

}
