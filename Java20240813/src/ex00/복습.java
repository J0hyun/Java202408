package ex00;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		{
		
			// 두 정수 입력받아 총점, 평균 구하기
		//Scanner sc = new Scanner(System.in); // 객체 생성(인스턴스 생성)
			
		//System.out.println("1번째 정수 입력 >> ");
		//int num1 = sc.nextInt();
			
		//System.out.println("2번째 정수 입력 >> ");
		//int num2 = sc.nextInt();
			
		//int sum = num1+num2;   //  정수(num1) + 정수(num2) = 정수
			
		//double avg = sum/2.0; //   정수(sum) / 실수 (2.0) = 실수 
			
		//System.out.println("두 수 합 : " + sum + ", 두 수 평균 : " + avg);
			
			// 정수 연산 정수 = 정수
			// 정수 연산 실수 = 실수
			// 정수or실수 연산 문자 = 문자
		}
				Scanner sc = new Scanner(System.in); // 객체 생성(인스턴스 생성)
				
				int count = 0;
					
				System.out.println("1번째 정수 입력 >> ");
				int num1 = sc.nextInt();
				count = count+1;
					
				System.out.println("2번째 정수 입력 >> ");
				int num2 = sc.nextInt();
				count = count+1;
					
				int sum = num1+num2;   //  정수(num1) + 정수(num2) = 정수
					
				double avg = (double)sum/count; //   정수(sum) / 실수 (2.0) = 실수 
				//double avg = sum/(double)count; //   정수(sum) / 실수 (2.0) = 실수 
					
				System.out.println("두 수 합 : " + sum + ", 두 수 평균 : " + avg);
		
	}

}
