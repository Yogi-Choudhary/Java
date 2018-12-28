package Decision_Making_Statements;

public class SwitchPrintDayName {
	public static void main(String[] args) {

		int day = 1;
		String dayString = null;
		switch (day) {
		case 0:
			dayString = "Sunday";
			break;
		case 1:
			dayString = "monday";
			break;

		default:
			dayString = "This day yet to come, pl wait!";
			break;

		}
		System.out.println(dayString);
	}
}
