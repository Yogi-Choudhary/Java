package co.in.Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {

	public static void main(String args[]) {
		ArrayList n = new ArrayList();
		n.add("Yogi");
		n.add("Deep");
		n.add("Choudhary");

		Iterator it = n.iterator();

		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}
	}

}