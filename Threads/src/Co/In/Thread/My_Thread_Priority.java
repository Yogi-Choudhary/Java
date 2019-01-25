package Co.In.Thread;

public class My_Thread_Priority {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("Hi:" + Thread.currentThread().getPriority() );
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("Hello:" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
	}
}
