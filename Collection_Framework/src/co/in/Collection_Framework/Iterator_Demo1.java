package co.in.Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator_Demo1 {
public static void main(String[] args) {
	ArrayList n = new ArrayList();
	n.add("Yogi");
	n.add("Deep");
	n.add("Choudhary");
	
	//Adding Integer value to String ArrayList
	n.add(new Integer(10));
	Iterator it  = n.iterator();
	
	while (it.hasNext()) {
		String s = (String)it.next();
		System.out.println(s);
		
	}
}
}
