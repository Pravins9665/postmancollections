package collection;

import java.util.HashSet;

public class hashset2 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println(hs);
		
		HashSet<Integer> num=new HashSet<Integer>();
		num.addAll(hs);
		num.add(10);
		System.out.println(num);
		
		num.removeAll(hs);
		System.out.println(num);
		 
		

	}

}
