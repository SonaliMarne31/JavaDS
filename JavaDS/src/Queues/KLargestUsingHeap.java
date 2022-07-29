package queues;
import System.out.TreeNode;
import java.lang.Math;
import java.util.PriorityQueue;

public class KLargestUsingHeap {
	
	public int[] heapify(int [] heapArr, int i) {
		
		if(i == 0) return heapArr;
		int temp = heapArr[i];
		while (heapArr[0] <  temp) {
			int parentIndex = Math.floorDiv(i, 2);
			System.out.println("parentIndex"+ parentIndex);
			if(heapArr[i] > heapArr[parentIndex]) {
				temp = heapArr[i];
				heapArr[i] = heapArr[parentIndex];
				heapArr[parentIndex] = temp;
			}
			heapify(heapArr, parentIndex);
		}
		
		return heapArr;
	}
	
	
	public void maxHeap(int[] arr) {
		
		int[] heapArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			heapArr[i] = arr[i];
			heapArr = heapify(heapArr, i);
		}
		System.out.println(heapArr);
		
	}

	public static void main(String[] args) {
		
		KLargestUsingHeap heap = new KLargestUsingHeap();
		int[] intArray = new int[]{ 7, 10, 4, 3, 20, 15 }; 
//		heap.maxHeap(intArray);
		int k = 3 ;
		int j = 1;
		
		
		PriorityQueue<Integer> intQueue = new PriorityQueue(intArray.length);
		for(int i=0; i<intArray.length; i++) {
			intQueue.add(intArray[i]);
		}
		
		while (intQueue.size() != 0 && k >= j ) {
			int kthEle = intQueue.remove();
			if(k == j) System.out.println(kthEle);
            j++;
        }

	}

}
