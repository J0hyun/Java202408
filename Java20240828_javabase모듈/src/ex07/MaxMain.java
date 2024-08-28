package ex07;

public class MaxMain {

	public static void main(String[] args) {
		
		int max = maxFunc(9,6,12);
		
		System.out.println(max);
		
		
	}

	static int maxFunc(int n1, int n2, int n3) {
		int max = 0;
		
		return Math.max(Math.max(n1, n2), n3);
		
		
	}
		
}
