package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist3 {

	public static void main(String[] args) {
		String arr[] = { "rose", "lotus", "lily" };
		for (String value : arr) {
			System.out.println(value);
		}
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
