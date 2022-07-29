package Queues;

import java.util.PriorityQueue;


public class PriorityQ {

	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	public PriorityQ() {
		this.pq = pq;
	}
	
	
	public static void main(String[] args) {
		PriorityQ p = new PriorityQ();
		p.pq.add(1);
		p.pq.add(2);
		p.pq.add(3);
		p.pq.add(4);
		p.pq.add(5);
		p.pq.add(6);
		
		System.out.println(p.pq);
		
	}

}
