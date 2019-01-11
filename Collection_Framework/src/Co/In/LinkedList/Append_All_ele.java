package Co.In.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Append_All_ele {
	public static void main(String[] args) {

		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// Add elements to the LinkedList
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");

		// Displaying linked list before add
		System.out.println("Before: LinkedList: " + list);

		// create a new list having few elements
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add("Item3");

		// Append the list elements to LinkedList
		list.addAll(arrayList);

		// Displaying the LinkedList after addAll
		System.out.println("After: LinkedList: " + list);
	}
}
