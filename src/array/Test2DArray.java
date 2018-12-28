package array;

public class Test2DArray {
	public static void main(String[] args) {
		// 10 rows and 2columns
		int[][] tables = new int[10][2];

		// Add Values in columns # 1
		tables[0][0] = 2;
		tables[1][0] = 4;
		tables[2][0] = 6;
		tables[3][0] = 8;
		tables[4][0] = 10;
		tables[5][0] = 12;
		tables[6][0] = 14;

		// Add values in columns # 2
		tables[0][1] = 3;
		tables[1][1] = 6;
		tables[2][1] = 9;
		tables[3][1] = 12;
		tables[4][1] = 15;
		tables[5][1] = 18;
		tables[6][1] = 21;

		// Print all elements of 2D array

		for (int row = 0; row < tables.length; row++) {

			for (int col = 0; col < tables.length; col++) {

				System.out.println(tables[row][col] + "\t");

			}

			System.out.println();
		}

	}
}
