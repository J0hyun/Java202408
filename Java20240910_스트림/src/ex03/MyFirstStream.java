package ex03;

import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		
		// 문자열 길이값 출력
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
		
		list.stream().map(n -> n.length())
		.forEach(n -> System.out.print(n + " "));
		
		int count = list.stream().mapToInt(n->n.length()).sum();
		System.out.println(count);
		
		
		
		
	}

}
