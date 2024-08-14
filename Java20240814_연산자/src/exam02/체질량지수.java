package exam02;

import java.util.Scanner;

public class 체질량지수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 입력(미터 단위) >> ");
		double height = sc.nextDouble();
				
		System.out.println("몸무게 입력(킬로그램 단위) >> ");		
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		
		if (bmi < 18.5) {
			System.out.println("저체중입니다.");
		}
		else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("정상 체중입니다.");
		}
		else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("과체중입니다.");
		}
		else {
			System.out.println("비만입니다.");
		}
		
	}

}
