package Co.In.Thread;

class HE implements Runnable {
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

class HO implements Runnable {
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

public class MyThread_RunMethod2 {
	public static void main(String[] args) {
		Runnable obj1 = new HI();
		Runnable obj2 = new HELLO();

		Thread t1 = new Thread();
		Thread t2 = new Thread();

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
	}
}
