package Co.In.Thread;

class HELLO extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class HI extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class MyThread_RunMethod {
	public static void main(String[] args) {
		HI obj1 = new HI();
		HELLO obj2 = new HELLO();

		obj1.start();
		obj2.start();
	}
}
