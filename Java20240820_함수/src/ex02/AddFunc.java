package ex02;

public class AddFunc {

	public static void main(String[] args) {
		
	double sum = add(10, 20); // 30. 0
		
		System.out.println("sum : " + sum);
	}
	
	//함수 기본형태
	static double add(int num1, int num2 ) { // num1 = 10   num2 = 20
		
		double add = (double)(num1 + num2); //  add = 30
		
		return add; // 30.0  
	}
	

}
