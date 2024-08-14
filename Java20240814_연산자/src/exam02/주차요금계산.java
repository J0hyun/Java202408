package exam02;

import java.util.Scanner;

public class 주차요금계산 {

	public static void main(String[] args) {
		
		
		double hour = 2.5;
		int price = 0;
		
		if (hour >= 0 && hour <= 1) {
			price = 1000;
		} else if (hour > 1 && hour <=2 ) {
			price = 2000;
		} else if (hour > 2 && hour <=3) {
			price = 3000;
		} else if (hour > 3 ) {
			price = 5000;
		}
		System.out.println("주차 시간을 입력하세요 : " + hour);
		System.out.println("주차 요금은 " + price + "원 입니다.");
		
		
		System.out.println("------------------------------");
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주차 시간을 입력하세요 (시간 단위): ");
		int fee = 0;
		double hours = sc.nextDouble();
		
		if(hours > 3) {
			fee = 5000;
		}else if (hours > 2) {
			fee = 3000;
		}else if (hours > 1) {
			fee = 2000;
		}else {
			fee = 1000;
		}
		System.out.printf("주차시간 : %.1f , 주차 요금은 %d원입니다.", hours, fee);
		
		
	}

}
