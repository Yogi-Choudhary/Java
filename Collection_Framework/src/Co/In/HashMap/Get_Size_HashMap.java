package Co.In.HashMap;

import java.util.HashMap;

public class Get_Size_HashMap {
	public static void main(String[] args) {

		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(11, "Value1");
		hashmap.put(22, "Value2");
		hashmap.put(33, "Value3");
		hashmap.put(44, "Value4");
		hashmap.put(55, "Value5");

		// int size() method returns the number of key value pairs
		System.out.println("Size of HashMap : " + hashmap.size());
	}
}
