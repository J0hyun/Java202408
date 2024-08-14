package ex03;

public class 조건연산자 {

	public static void main(String[] args) {
		
		// 국어점수가 70이상이면 합격, 아니면 불합격
		
		int kor = 65;
		
		String result = (kor >= 70 ? "합격" : "불합격"); // (피연산자 ? 피연산자(true) : 피연산자(false))
		
		System.out.println(result);
		

	}

}
