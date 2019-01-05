package co.in.Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo2 {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<String>();
		n.add("Yogi");
		n.add("Deep");
		n.add("Choudhary");

		Iterator<String> it = n.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);

		}
	}
}
