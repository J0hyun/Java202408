package ex07;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		int balance = 0; // 잔고
		int deposit = 0; // 예금
		int withdrawal = 0; // 출금
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while (flag) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택 >>");
			
			int num = sc.nextInt();
			
			if (num == 1) { //예금
				System.out.println("예금액 >");
				deposit = sc.nextInt();
				balance += deposit;
			} else if (num == 2) {
				System.out.println("출금액 >");
				withdrawal = sc.nextInt();
				balance -= withdrawal;
				} else if (num == 3) {
					System.out.println("잔고 >" + balance);
				} else {
					flag = false;
				}
			
		}
		System.out.println("프로그램 종료");
	}
}