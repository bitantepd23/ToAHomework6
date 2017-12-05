import java.util.Random;

public class Heap {

	int[] heap;
	
	public Heap() {
		this.heap = new int[100];
		this.initializeHeap();
	}
	
	public Heap(int[] heap) {
		this.heap = heap;
	}
	
	public void initializeHeap() {
		
		Random randGen = new Random();
		for (int i=0; i<this.heap.length; i++) {
			this.heap[i] = randGen.nextInt(1000);
		}
	}
	
	public void heapSort() {
        
		int[] arrayIn = this.heap;
		
        // Build heap (rearrange array)
        for (int i = arrayIn.length / 2 - 1; i >= 0; i--)
            heapify(arrayIn, arrayIn.length, i);
 
        // One by one extract an element from heap
        for (int i=arrayIn.length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arrayIn[0];
            arrayIn[0] = arrayIn[i];
            arrayIn[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arrayIn, i, 0);
        }
	
	}
	
	private void heapSort(int[] arrayIn) {
        
        // Build heap (rearrange array)
        for (int i = arrayIn.length / 2 - 1; i >= 0; i--)
            heapify(arrayIn, arrayIn.length, i);
 
        // One by one extract an element from heap
        for (int i=arrayIn.length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arrayIn[0];
            arrayIn[0] = arrayIn[i];
            arrayIn[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arrayIn, i, 0);
        }
	
	}
	
	public void heapify(int[] arrayIn, int n, int i) {
		
		int MAX = i; 		// largest value
		int left = i*2 + 1;
		int right = i*2 + 2;
		
		if (left < n && arrayIn[left] > arrayIn[MAX]) {
			MAX = left;
		}
		
		if (right < n && arrayIn[right] > arrayIn[MAX])
			MAX = right;
		
		if (MAX != i) {
			int swapNum = arrayIn[i];
			arrayIn[i] = arrayIn[MAX];
			arrayIn[MAX] = swapNum;
			
			heapify(arrayIn, n, MAX);
		}
		
	}
	
	public void remove(int element) {
		
		int[] arrayIn = this.heap;		
		int[] removedElArray = new int[arrayIn.length-1];
		int arrayIter = 0;
		
		for (int i=0; i<removedElArray.length; i++) {
			if (arrayIn[arrayIter] == element) {
				arrayIter++;
			}
			removedElArray[i] = arrayIn[arrayIter];
			arrayIter++;
		}
		heapSort(removedElArray);
		this.heap = removedElArray;
	}
	
	public void printHeap() {
		
		for (int i=0; i<this.heap.length; i++) {
			System.out.print(this.heap[i]+", ");
		}
		System.out.println();
	}
	
}
