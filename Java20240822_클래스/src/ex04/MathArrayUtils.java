package ex04;

public class MathArrayUtils {
	
	
	static int sum(int[] values) {
			int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
			
	}
	static double average(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		double average = (double) sum / values.length;
		return average;
	}
	static int min(int[] values) {
		int min = 9999;
		for(int i=0; i<values.length; i++) {
			if(min > values[i])
				min = values[i];
		}
		return min;
	}
	static int max(int[] values) {
		int max = 0;
		for (int i=0; i<values.length; i++) {
			if(max < values[i])
				max = values[i];
		}
		return max;
	}
	
}
