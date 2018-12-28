package Decision_Making_Statements;

public class ForWithLabeledBreak {
	public static void main(String[] args) {

		int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		search: // Define Label
		// Iterate rows
		for (int[] row : table) {
			for (int n : row) {
				// check if number is even
				if (n % 2 == 0) {
					System.out.println(n);
					// Terminate loop from label
					break search;

				}

			}

		}
	}
}
