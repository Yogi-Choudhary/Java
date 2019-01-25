package Co.In.Thread;

public class My_Thread_GetNameSetName_Method {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}

		t2.start();

	}
}
