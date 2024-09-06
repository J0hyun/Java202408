package thread;

import static utill.MyLogger.log;

import utill.MyLogger;

public class MyLoggerMain {

	public static void main(String[] args) {
		MyLogger.log("hello thread");
		MyLogger.log(123);
	}

}
