package ex05;

import java.util.Scanner;

/*
 *  줄복사 : ctrl + alt + 상,하 방향키
 *  줄삭제 : ctrl+d
 *  줄이동 : alt + 방향키(상,하)
 *  창분할 : ctrl + Shift + [
 *  화면확대 : ctrl + m 
 *  
 *  캡쳐 = 윈도우키 + shift + s
 *  
 *  
 *  
 */

public class 중괄호블럭 {

	public static void main(String[] args) {
		int kor; // 변수 선언
		
		kor = 100;
		
		System.out.println(kor); // 변수 사용
		
		
		{
			// 블럭 안 내용은 블럭 내에서 만 사용가능  밖에서 사용불가
			int num = 10;
			System.out.println(num);
		}

		{	
			int num2 = 20;
			System.out.println(num2);
			System.out.println(kor);
		}
		
		{
			int num2 = 30;
			System.out.println(num2);
		}
		System.out.print("kor");
		System.out.print("kor");
		System.out.print("kor\n");
		System.out.println("kor");
		System.out.println("kor");
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		System.out.println(line);
		
		int number = sc.nextInt();
		System.out.println(number);
	
		
		
	}

}
