package co.in.Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class Test_Collection {
	public static void main(String[] args) {
		// creates a collection
		Collection c = new ArrayList();

		// Add elements into Collection
		c.add("Bura mat Dekho"); // Index#0
		c.add("Bura mat suno"); // Index#1
		c.add("Bura mat bolo"); // Index#2

		System.out.println("Lenght of Collection : " + c.size());

		// Print all elements of Collection
		for (Object object : c) {
			System.out.println(object);

		}
		// Covert collection into array
		Object[] oArray = c.toArray();

		// Print all element of array
		for (Object object : oArray) {
			String s = (String) object;
			System.out.println(s);

		}

	}
}
