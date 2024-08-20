package ex06;

import java.util.Scanner;

public class ClassEx00 {

	public static void main(String[] args) {
		Money m1 = new Money();
		
		m1.계좌번호 = "123-12345-122333444";
		m1.이름 = "이종현";
		m1.입금();
		m1.출금();
		
		
		
		
		m1.info();
		
		
		
	}
}
	class Money {
		int deposit = 0;  // 입금
		int withdrawal = 0; // 출금 
		int balance = 0; // 잔액
		String 계좌번호;
		String 이름;
		
		Scanner sc = new Scanner(System.in);
		
		void info () {
			System.out.printf("계좌번호 : %s, 이름 : %s, 잔액 : %d", 계좌번호, 이름, balance);
		}
		
		void 입금 () {
			System.out.println("입금액 >>");
			deposit = Integer.parseInt(sc.nextLine());
			balance += deposit;
			
		}
		
		void 출금 () {
			System.out.println("출금액 > ");
			withdrawal = Integer.parseInt(sc.nextLine());
			balance -= withdrawal;
		}
		
		
	}
	
	
	
	

