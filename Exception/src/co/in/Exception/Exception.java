package co.in.Exception;

public class Exception {
	public static void main(String[] args) {
		int d = 0;
		int n = 20;
		try {
			int fraction = n / d;
			System.out.println("This line will not be Exception");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("In tne catch Block due to Exception = " + e);
		}
		System.out.println("End of main");
	}
}
