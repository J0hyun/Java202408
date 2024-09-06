package thread;

import static utill.MyLogger.log;

class MyRunnable3 implements Runnable {

	@Override
	public void run() {
		try {
			while(true) {
				log("A");
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
class MyRunnable4 implements Runnable{
	@Override
	public void run() {
		try {
			while(true) {
				log("B");
				Thread.sleep(500);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}

public class ThreadMain04 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyRunnable3(), "Thread-A");
		Thread thread2 = new Thread(new MyRunnable4(), "Thread-B");
		
		thread1.start();
		thread2.start();
	}

}
