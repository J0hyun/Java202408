package ex04;

import java.util.Scanner;

public class 캐스트형변환 {

	public static void main(String[] args) {
		// 수동 형변환 or 강제 형변환
		// 큰 자료형 -> 작은 자료형 대입한다.
		short s1 = 32767;
		int num1 = 50000;
		
		s1 = (short)num1; // 강제 형변환 int -> short -> 50000
		
		System.out.println(s1);
		
		double d1 = 10.2;
		
		int num2 = (int)d1; // 강제 형변환
		
		System.out.println(num2);
		
		System.out.println("----------------------");
		
		double d2 = 10 + 10.2; // 10.0 + 10.2
		
		String str1 = 10 + "20"; // "10" + "20"
		
		System.out.println(d2);
		System.out.println(str1);
		

	}

}
