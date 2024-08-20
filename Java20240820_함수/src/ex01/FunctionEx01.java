package ex01;

public class FunctionEx01 {

	public static void main(String[] args) {
		func1(); // 함수 호출
		
		func2(12);
		
		int n = func3(21);
		
		if(n==1) System.out.println("홀수");
		else System.out.println("짝수");
	}
	
	static int func3(int num) {
		if(num % 2 == 0)
			return 0; // 짝수
		else 
			return 1; // 홀수
	}
	
	
	
	
    // void: 반환타입, 함수명: func1, 매개변수: ()
	static void func1( ) { // 함수
		System.out.println("매개변수(함수에게 값입력하지 않는다), 반환타입 없는 함수!");
	}
	
	//반환타입X 입력만 있는 경우
	static void func2(int num) {
		if(num % 2 == 0)
			System.out.println("입력값은 짝수");
		else
			System.out.println("입력값은 홀수");
	}
}
