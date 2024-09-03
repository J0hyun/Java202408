package ex06;

//매개변수있고, 반환형 있는 경우
interface MaxInterface {
	int max(int num1, int num2); //반드시 한 개 
}


public class Exam01 {

	public static void main(String[] args) {
		
		//람다
		MaxInterface max1 =	(num1, num2) -> {
				return (num1 > num2) ? num1 : num2;
			};
			
		System.out.println(max1.max(5, 1));
		
		System.out.println(max1.max(5, 11));
		
	}

}
