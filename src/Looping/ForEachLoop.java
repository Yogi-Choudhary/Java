package Looping;

import java.util.ArrayList;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Iterate array elements
		for (int n : numbers) {
			System.out.println(n);
		}
		// Print all element of collection
		ArrayList<String> name = new ArrayList<String>();
		name.add("One");
		name.add("Two");

		for (String n :  name) {
			System.out.println(n);

		}
	}
}
