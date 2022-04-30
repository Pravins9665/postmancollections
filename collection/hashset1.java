package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		//HashSet hs=new HashSet();
		//default capacity =16 and load factor 0.75
		HashSet hs=new HashSet(100,(float)0.90);
		hs.add(100);
		hs.add(10.9);
		hs.add('p');
		hs.add("string");
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove(100);
		System.out.println("after removing element :"+hs);
		
		System.out.println(hs.contains("string"));
		System.out.println(hs.contains("xyz"));
		
		System.out.println(hs.isEmpty());
		
		/*for(Object p:hs) {
			System.out.println(p);
		}*/
		
		Iterator it=hs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
		}
		
	}

}
