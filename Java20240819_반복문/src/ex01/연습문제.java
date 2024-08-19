package ex01;

public class 연습문제 {

	public static void main(String[] args) {
		
		//int 형 배열 참조변수 nArr 설정
		int[] nArr = new int[5];
		
		
		
		// 배열 초기화 -> 값 범위는 1~100 => 랜덤함수 이용
		for (int i = 0; i < 5; ++i) 
			nArr[i] = (int)(Math.random() * 100 )+1;
			
			for(int i=0; i<5; i++)
				System.out.print(nArr[i] + ", ");
			
			int max, min;
			max = min = nArr[0];
			for(int i = 0; i < 5; i++) {
				if(max < nArr[i] ) max = nArr[i];
				
				if(min > nArr[i] ) min = nArr[i];
			}
			System.out.printf("\n최대값 : %d, 최소값: %d\n", max, min);
			
			
			int sum = 0;
			for (int i = 0; i < nArr.length; i++) {
				sum += nArr[i]; // sum = sum + nArr[i]
			}
			System.out.println("총점 : " + sum);
			
			double avg = (double)sum / nArr.length;
			
			System.out.println("평균 : " + avg);
			
			//오름차순 정렬(이중 for)
			
			for (int i = 0; i < nArr.length; i++) { // 1~5회전
				for (int j = 0; j < nArr.length-1; j++) {
					if(nArr[j] > nArr[j+1]) {
						int tmp = nArr[j];
						nArr[j] = nArr[j+1];
						nArr[j+1] = tmp;
					}
					
				}
			}
			for (int i = 0; i < nArr.length; i++)
				System.out.print(nArr[i] + ", ");
			
	}

}
