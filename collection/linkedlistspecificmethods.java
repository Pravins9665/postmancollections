package collection;

import java.util.LinkedList;

public class linkedlistspecificmethods {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("kitkat");
		ll.add("kitkat");
		ll.add("dairy milk");
		ll.add("perk");
		
		System.out.println(ll);
		
		ll.addFirst("5star");
		ll.addLast("silk");
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("after removing first and last elements "+ll);

	}

}
