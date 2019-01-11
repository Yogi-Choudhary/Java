package Co.In.LinkedList;

import java.util.LinkedList;

public class LinkedList_Add {
	public static void main(String[] args) {

		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");

		// Displaying LinkedList elements
		System.out.println("LinkedList elements: " + list);

		// Adding another element
		list.add("Kate");

		// Displaying LinkedList elements after add(E e)
		System.out.println("LinkedList elements: " + list);
	}
}
