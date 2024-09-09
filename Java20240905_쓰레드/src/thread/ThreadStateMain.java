package thread;

import static utill.MyLogger.log;

public class ThreadStateMain {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new MyRunnable(), "myThread");
		log("mhThead.state1 = " + thread.getState()); // 
		log("myThead start()");
		thread.start();
		Thread.sleep(1000);
		
		log("myThread.stat3 = + " + Thread.currentThread().getState());
		Thread.sleep(4000);
		log("myThread.stat5 = + " + Thread.currentThread().getState());
		log("end");
	}

	
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			try {
				log("start");
				log("myThread.stat2 = + " + Thread.currentThread().getState());
				log("sleep() start");
				Thread.sleep(3000);
				log("sleep() end");
				log("myThread.stat4 = + " + Thread.currentThread().getState());
				log("end");
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
}
