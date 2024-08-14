package exam01;

public class OperationEx1 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;
		int num3 = 35;
		
		int sum = num1 + num2 + num3;
		double average = sum / 3.0;
		
		System.out.println(sum);
		
		System.out.printf("sum : %d, 평균 : %.1f\n", sum, average); // %d 정수  %.1f 실수 소수점 1자리
	}

}
