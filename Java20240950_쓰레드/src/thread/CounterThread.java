package thread;

import static utill.MyLogger.log;

public class CounterThread extends Thread {
	@Override
	public void run() {
		try {
		for(int i = 0; i <= 5; i++) {
			log("value :" + i );
			Thread.sleep(1000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
