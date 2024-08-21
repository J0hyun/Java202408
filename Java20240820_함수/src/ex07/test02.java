package ex07;

public class test02 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		
		int [] array = { 1, 5, 3, 8, 2};
		
		max = min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);
	}

}
