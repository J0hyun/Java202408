package ex01;

import java.util.Random;

public class 로또2 {

	public static void main(String[] args) {
		
		int[] lotto = new int [45]; // 45개 방 개설
		int count = 0;
		
		Random random = new Random();
		for(int i = 0; i < 45; i++) // 1~45개 숫자 대입
			lotto[i] = i+1;
		
		for(int j=0; j<5; j++) { 
		
		for(int i=0; i<45; i++) {
			int index = random.nextInt(45);
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
		}
		
		for(int k = 0; k<6; k++)
			System.out.print(lotto[k] + " ");
		System.out.println();
	
		
		
		}
	}
}
		

