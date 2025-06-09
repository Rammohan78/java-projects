package app;
import java.util.*;
public class Heapexample {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		minHeap.add(20);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(10);
		System.out.println("min heap output");
		
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(20);
		maxHeap.add(5);
		maxHeap.add(15); 
		maxHeap.add(10);
		
		System.out.println("MAX Heap output");
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
		
	

	}

}
