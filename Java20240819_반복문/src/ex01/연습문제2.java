package ex01;

public class 연습문제2 {

	public static void main(String[] args) {
		
		// int 형 배열 참조변수 nArr설정
		int[] nArr = new int[5];
		
		// 배열 초기화 -> 값 범위는 1~ 100 => 랜덤함수 이용
		for(int i=0; i < 5; i++)
			nArr[i] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<5; i++)
			System.out.print(nArr[i] + ", ");
		
		// 최대값 최소값 구하기
		int max, min;
		max = min = nArr[0];
		for(int i= 0; i<5; i++) {
			if (max < nArr[i]) max = nArr[i];
					
			if (min > nArr[i]) min = nArr[i];
				
		}
		System.out.println("\n최대값 : " + max + " 최소값 : " + min  );
				
		
		
		
		}
		}
				



