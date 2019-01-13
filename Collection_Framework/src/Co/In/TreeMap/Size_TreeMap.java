package Co.In.TreeMap;

import java.util.TreeMap;

public class Size_TreeMap {
	public static void main(String args[]) {

		// Create a TreeMap
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		// Put elements to the map
		treemap.put("Key1", "Value1");
		treemap.put("Key2", "Value2");
		treemap.put("Key3", "Value3");
		treemap.put("Key4", "Value4");
		treemap.put("Key5", "Value5");

		// Displaying size of the TreeMap
		/*
		 * public int size(): Returns the number of key-value mappings in this map.
		 */
		System.out.println("Size of TreeMap: " + treemap.size());
	}
}
