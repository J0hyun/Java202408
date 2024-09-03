package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
 * 숫자 2개 전달하면 최대값 반환
 */

public class Exam06 {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = num -> System.out.println(num);

		consumer.accept(199);
	}

}
