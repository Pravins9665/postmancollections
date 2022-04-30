package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add('a');
		q.add('b');
		q.add('c');
		q.add('d');
		q.offer('e');
		
		System.out.println(q);
		
	    //get head elements
		//System.out.println(q.element());
		/*System.out.println(q.peek());
		
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);*/
		
		/*Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}*/
		
		for(Object e:q) {
			System.out.println(e);
		}

	
	}

}
