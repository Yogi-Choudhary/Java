package Exercise;

public class Avg_Odd_EvenNumber {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			sum = sum + i;
			System.out.println("Avg==" + sum);
			if (i % 2 == 0) {
				System.out.println("EVEN" + i);

			} else {
				System.out.println("ODD= " + i);

			}

		}
	}
}
