package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
 * 숫자 전달하면 출력
 */

public class Exam07 {

	public static void main(String[] args) {

BiFunction<Integer, Integer, String> biFunction =  (n1,n2) -> String.valueOf(n1+n2+"");
		
		String str = biFunction.apply(10, 20);
		System.out.println(str);
		
	}

}
