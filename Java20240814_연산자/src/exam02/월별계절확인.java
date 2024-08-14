package exam02;

import java.util.Scanner;

public class 월별계절확인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력 >> ");
		int num = sc.nextInt();
		
		
		String season = "";
		
		if (num == 12 || num == 1 || num == 2) { // num == 12 || 1 || 2 x
			season = "겨울";
		}else if(num == 3 || num == 4 || num == 5){ // season >= 3 && season <=5 
			season = "봄";
		}else if (num == 6 || num == 7 || num == 8) {
			season = "여름";
		}else if (num == 9 || num == 10 || num == 11) {
			season = "가을";
		}else {
			System.out.println("1 ~ 12 사이 숫자만 입력");
		}
		
		System.out.println(season);
	}

}
