package co.in.Exception;

public class Exception_Catch {
	public static void main(String[] args) {
		try {
			int d = 1;
			int n = 20;
			int fraction = n / d;
			int g[] = { 1 };
			g[20] = 100;
		} catch (ArithmeticException e) {
			System.out.println("In the catch due to Exception = " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch Clock due to Exception = " + e);
		}
		System.out.println("End of Main");
	}
}
