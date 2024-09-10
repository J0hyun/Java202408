package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int total = Arrays.stream(arr).filter(n -> n % 2 == 1).sum(); // {1,2,3,4,5,6}에서 나머지가 1인 경우 true
		
		System.out.println(total);  // 1 + 3 + 5 합 
		

		long count = Arrays.stream(arr).filter(i -> i%3 == 0).count(); // {1,2,3,4,5,6}에서 i / 3의 나머지가 0인 경우 true		
		System.out.println(count);
		
		
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));  // forEach 배열에 있는 숫자들 출력
		
		
		
	}

}
