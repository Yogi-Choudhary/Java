package Co.In.Thread;

class Hi {
	public void show() {
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

class Hello {
	public void show() {
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

public class MyThread_SleepMethod {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		obj1.show();
		obj2.show();
	}
}
