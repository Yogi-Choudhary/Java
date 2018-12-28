package Decision_Making_Statements;

public class WhileWithBreak {
	public static void main(String[] args) {
		int i = 0;
		boolean flag = true;
		while (flag) {
			// Break the loop if i is equal to 5
			if (i == 5) {
				break;
			}
			System.out.println(i + " Hello JAVA");
			i++;
		}
	}
}
