package ex06;


/*
 * 숫자 전달하면 출력
 */

public class Exam08 {

	public static void main(String[] args) {
		
		int max = (a,b) -> a > b ? a : b;
		
		
		printVar (name, i) -> {
			System.out.println(name+"="+i);
		};
		
		
		x -> x*x;
		
		() -> (int)(Math.random()*6);
		
		(int[] arr) -> {int sum =0; 
				for(int i : arr) 
					sum += i; 
						return sum;}
	}

}
