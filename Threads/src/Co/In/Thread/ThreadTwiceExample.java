package Co.In.Thread;

public class ThreadTwiceExample implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "is executing");

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadTwiceExample(), "t1");
		
		t1.start();
		t1.start();
	}

}
