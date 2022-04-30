package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// declare arraylist :-
		// for heterogeneous data---------
		// ArrayList al=new ArrayList();
		// for homogeneous data only integer can store------
		// ArrayList<Integer> al=new ArrayList<Integer>();
		// only string datatype stores--------
		// ArrayList<String> al=new ArrayList<String>();
		// List al=new ArrayList();

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("priyanka");
		al.add(30.7);
		al.add('p');
		al.add(true);
		System.out.println(al);

		// size of elements
		System.out.println("no of elements : " + al.size());

		// remove method
		al.remove(3);
		System.out.println("After removing index 3 : " + al);

		// insert new element
		al.add(2, "okk");
		System.out.println("inserting value : " + al);

		// retrieve specific value
		System.out.println(al.get(3));

		// replace value
		al.set(2, "guitar");
		System.out.println("after set or replacing new value : " + al);

		// search or contains
		System.out.println(al.contains("guitar"));
		System.out.println(al.contains("guitarr"));

		// is empty
		System.out.println(al.isEmpty());

		// how to read the data :
		// using for loop-------
		/*
		 * System.out.println("read element using for loop"); for(int
		 * i=0;i<=al.size();i++) { System.out.println(al.get(i)); }
		 */

		// using for each loop
		System.out.println("reading elements using for each loop ");
		for (Object e : al) {
			System.out.println(e);
		}

		// using Iterator() method
		System.out.println("reading elements using Iterator() method ");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
