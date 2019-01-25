package Co.In.Thread;

public class MyThread_RunMethod3 {
	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
				{
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
		Runnable obj2 = new new Runnable() {
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

