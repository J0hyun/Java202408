package ex04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// int 크기 5명 방 설정 
		int[] room = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<5; i++) {
			System.out.println("값을 입력 하세요 >>");
			room[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i<5; i++) {
			if (room[i] > max)
				max = room[i];
		}
		System.out.println("최대값: " + max);
		
		
	}

}
