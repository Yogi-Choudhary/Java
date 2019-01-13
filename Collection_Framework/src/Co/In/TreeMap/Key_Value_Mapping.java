package Co.In.TreeMap;

import java.util.TreeMap;

public class Key_Value_Mapping {
	public static void main(String[] args) {

		// Create a TreeMap
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		// Add key-value pairs to the TreeMap
		treemap.put("Key1", "Item1");
		treemap.put("Key2", "Item2");
		treemap.put("Key3", "Item3");
		treemap.put("Key4", "Item4");
		treemap.put("Key5", "Item5");

		// TreeMap Elements Before remove
		System.out.println("Before: TreeMap contains: " + treemap);

		// Removing element which is mapped to Key3
		/*
		 * public V remove(Object key): Removes the mapping for this key from this
		 * TreeMap if present.
		 */
		Object removedElement = treemap.remove("Key3");
		System.out.println("Removed Element: " + removedElement);

		// TreeMap Elements after remove
		System.out.println("After: TreeMap contains: " + treemap);
	}
}
