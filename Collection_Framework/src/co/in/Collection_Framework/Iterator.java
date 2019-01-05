package co.in.Collection_Framework;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		ArrayList no = new ArrayList();

		no.add("Raju");

		java.util.Iterator it = no.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

	}
}
