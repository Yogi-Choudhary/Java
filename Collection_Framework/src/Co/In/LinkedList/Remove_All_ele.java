package Co.In.LinkedList;

import java.util.LinkedList;

public class Remove_All_ele {
	public static void main(String[] args) {

		// Create a LinkedList
		LinkedList<String> linkedlist = new LinkedList<String>();

		// Add elements to LinkedList
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item4");
		linkedlist.add("Item5");

		// Displaying Elements before remove
		System.out.println("Before clear():");
		for (String str : linkedlist) {
			System.out.println(str);
		}

		// Removing all the elements from LinkedList
		linkedlist.clear();

		// LinkedList elements after remove
		System.out.println("After clear():");
		for (String str2 : linkedlist) {
			System.out.println(str2);
		}
	}
}
