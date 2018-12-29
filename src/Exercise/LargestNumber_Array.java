package Exercise;

public class LargestNumber_Array {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 16, 7, 8, 9, 10 };
		int i = 1, temp = 0;
		for (int j = 0; j < a.length; j++) {
			if (temp < a[i]) {
				temp = a[i];

			}

		}
		System.out.println(temp);
	}
}
