package exam01;

public class OperationEx2 {

	public static void main(String[] args) {
		int num = 4000;
		int hours  = num / 3600;    // 1 "시간"
		int seconds = num % 3600;  // 나머지 400
		
	
		int minutes = 400 / 60;   // 6 "분"
		seconds = 400 % 60;  	  // 나머지 40 "초"
		
		
		System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초" );
		System.out.printf("%d시간 %d분 %d초\n", hours, minutes, seconds);
	}

}
