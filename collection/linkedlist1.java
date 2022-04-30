package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		//declare linkedlist :-----
		//LinkedList ll=new LinkedList();
		//LinkedList<Integer> ll=new LinkedList<Integer>();
		//LinkedList<String> ll=new LinkedList<String>();
		
		LinkedList LL=new LinkedList();
		
		//addelements in linked list
		
		LL.add(100);
		LL.add(10.8);
		LL.add("violin");
		LL.add('p');
		LL.add(true);
		LL.add(null);
		
		System.out.println(LL);
		
		System.out.println(LL.size());
		
		//remove 
		LL.remove(2);
		System.out.println("after removing "+LL);
		
		//insert/adding element in middle of linkedlist
		LL.add(4,"java");
		System.out.println("after inserting element "+LL);
		
		//retrieving value
		System.out.println(LL.get(1));
		
		//replace value
		LL.set(3, "good");
		System.out.println("After changing value "+LL);
		
		//contains
		System.out.println(LL.contains("good"));
		System.out.println(LL.contains("ps"));
		
		//empty
		System.out.println(LL.isEmpty());
		
		//reading elements from linkedlist using for loop :-----
		/*for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		}*/
		
		//using for each loop :------
		/*for( Object e:LL) {
			System.out.println(e);
		}*/
		
		//by using Iterator() method
		Iterator it=LL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		

	}

}
