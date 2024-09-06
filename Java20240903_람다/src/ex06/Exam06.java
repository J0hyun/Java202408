package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
 * 숫자  전달하면 출력
 */

public class Exam06 {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = num -> System.out.println(num);

		consumer.accept(199);
	}

}
