package co.in.Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Queue_Class {
	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();

		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");

		System.out.println("Elementa in Queue: " + q);
		System.out.println();
		System.out.println("Removed element: "+q.remove());
		System.out.println();
		System.out.println("Elementa in Queue: " + q);
		System.out.println();
		System.out.println("poll(): "+q.poll());
		System.out.println();
		System.out.println("peek(): "+q.peek());
		System.out.println();
		System.out.println("Elements in Queue:"+q);
		
	}
}
