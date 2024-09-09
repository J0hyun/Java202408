package thread;

public class HelloRunnableMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " main() start");

		HelloRunnable helloThread = new HelloRunnable();
		Thread thread = new Thread(helloThread);
		
		thread.start();
		
		
		System.out.println(Thread.currentThread().getName() + " main() end");
	}

}
