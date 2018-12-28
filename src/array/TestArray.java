package array;

public class TestArray {
	public static void main(String[] args) {
		// declares an array of integers
		int[] table;
		// allocates memory for 10 integers
		table = new int[10];
		// Access element and assign a value
		table[0] = 2;
		table[1] = 4;
		table[2] = 6;
		table[3] = 8;
		table[4] = 10;
		table[5] = 12;
		table[6] = 14;
		table[7] = 16;
		table[8] = 18;
		table[9] = 20;

		// Access 5th element of table
		int ele = table[5];
		System.out.println("5th element " + ele);

		// Get the size of an array
		int size = table.length;
		System.out.println("size is " + size);

	}
}
