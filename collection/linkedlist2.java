package collection;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add('X');
		ll.add('Y');
		ll.add('Z');
		ll.add('A');
		ll.add('B');
		ll.add('C');
		
		LinkedList LL=new LinkedList();
		LL.addAll(ll);
		System.out.println(LL);
		
		LL.removeAll(ll);
		System.out.println(LL);
		
		Collections.sort(ll);
		System.out.println("after sorting "+ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("reverse order "+ll);
		
		Collections.shuffle(ll);
		System.out.println("after shuffled "+ ll);
		
		

	}

}
