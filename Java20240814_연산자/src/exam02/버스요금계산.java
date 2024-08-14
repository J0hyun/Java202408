package exam02;

import java.util.Scanner;

public class 버스요금계산 {

	public static void main(String[] args) {
		int age = (int)(Math.random()*100)+1; // 나이 랜덤
		
		int fee = 2000; // 버스 요금
		double rate = 0; // 할인율
		
		if (age >= 65 || age <=5 ) {
			rate = 0;
		}else if (age >= 6 && age <= 12) {
			rate = 0.5;
		}else if (age >= 13 && age <= 18) {
			rate = 0.75;
		}else if (age >= 19 && age <= 64) {
			rate = 1;
		}
		
		int result = (int)(fee * rate);
		System.out.printf("나이 : %d, 버스 요금 : %d원\n", age, result);
		
		
	}

}
