package co.in.Collection_Framework;

import java.util.*;

public class DeQue_Class {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();

		dq.add("Glenn");
		dq.add("Nagan");
		dq.add("Maggi");
		dq.add("Rick");
		dq.add("Doryl");

		System.out.println("Element in Deque: " + dq);
		System.out.println();
		System.out.println("Removed element: " + dq.removeLast());
		System.out.println();
		System.out.println("Head: " + dq.element());
		System.out.println();
		System.out.println("Poll(): " + dq.pollLast());
		System.out.println();
		System.out.println("Peek(): " + dq.peek());
		System.out.println();
		System.out.println("Elements in Deque: " + dq);
	}
}
