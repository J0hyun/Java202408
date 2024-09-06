package thread;

import static utill.MyLogger.log;
import static utill.ThreadUtils.sleep;

public class JoinMainV1 {

	public static void main(String[] args) throws Exception  {
		
		log("Start");
		SumTask task1 = new SumTask(1,50);
		SumTask task2 = new SumTask(51,100);
		Thread thread1 = new Thread(task1, "thread-1");
		Thread thread2 = new Thread(task2, "thread-1");
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		log("thread1.result = " + task1.result);
		log("thread2.result = " + task2.result);
		
		int sumAll = task1.result + task2.result;
		log("task1 + task2 = " + sumAll);
		log("end");

	}

	
	
	static class SumTask implements Runnable {
		int startValue;
		int endValue;
		int result = 0;
		
		public SumTask(int s, int e) {
			startValue = s;
			endValue = e;
			
			
		}
		
		@Override
		public void run() {
			log("작업 시작");
			sleep(2000);
			int sum = 0;
			for( int i = startValue; i <= endValue; i++)
				sum +=i;
			result = sum;
			log("작업 완료 result=" + result);
		}
	}
}
