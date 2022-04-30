package collection;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		ArrayList all = new ArrayList();
		all.addAll(al);
		System.out.println(all);

		all.removeAll(al);
		System.out.println("after removing all elements from al " + all);

		// sort -----by using collection.sort() method
		System.out.println("elements in the arraylist  :" + al);
		Collections.sort(al);
		System.out.println("elements in the arraylist after sorting :" + al);

		// reverse order----collection.sort()
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("elements in the arraylist after sorting in reverse order :" + al);

		// shuffeling elements-------Collections.shuffle
		Collections.shuffle(al);
		System.out.println("elements in the arraylist after shuffling :" + al);

	}

}
