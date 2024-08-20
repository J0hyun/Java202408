package ex02;

public class AddFunc2 {

	public static void main(String[] args) {
		
		int [] arr = add(10, "abc", 20); // 
		int sum = 0;
		
	
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
	}
		System.out.println("sum :" + sum);
	
	}
	
	
	static int[] add(int num1, String str1, int num2) {
		
		int[] nArr = {10, 20, 30, 40, 50};
		
		return nArr;
	}
	

}
