package Co.In.TreeMap;

import java.util.TreeMap;

public class Remove_All_Mappings {
	public static void main(String[] args) {

		// Create a TreeMap
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		// Add key-value pairs to the TreeMap
		treemap.put("Key1", "Item1");
		treemap.put("Key2", "Item2");
		treemap.put("Key3", "Item3");
		treemap.put("Key4", "Item4");
		treemap.put("Key5", "Item5");

		// TreeMap elements before calling clear()
		System.out.println("Before: TreeMap contains: " + treemap);

		// Make TreeMap empty
		/*
		 * public void clear(): It removes all of the mappings from this map. The map
		 * will be empty after this call returns.
		 */
		treemap.clear();

		// TreeMap elements after calling clear()
		System.out.println("After: TreeMap contains: " + treemap);
	}
}
