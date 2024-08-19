package ex03;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 0; // 잔고
		int deposit = 0; // 예금
		int withdrawal = 0; // 출금
		boolean pay = true;
		
		
		while (pay) {
			System.out.println("--------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			int num = sc.nextInt();
			
			
			if(num == 1) {
				System.out.println("예금액>");
				deposit = sc.nextInt();
				balance += deposit;
				
			}
			if (num == 2) {
				System.out.println("출금액>");
				withdrawal = sc.nextInt();
				balance -= withdrawal;
				
			}
			if (num == 3) {
				System.out.println("잔고>" + balance );
			}
			if (num == 4) {
				pay = false;
			
			}
			
			
		}
		System.out.println("프로그램 종료");
		
	}

}
