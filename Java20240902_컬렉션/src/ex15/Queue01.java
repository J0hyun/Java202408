package ex15;

import java.util.*;

public class Queue01 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		List<Integer> ck = new Stack<Integer>();
		
		/*
		 * Queue는 인터페이스이다. 따라서 객체 생성을 할 수 없다.
		 * Queue를 사용하기 위해 Queue를 구현하던가, 구현된 객체를 사용하면 된다.
		 */
		
		Queue<Integer> qu = new ArrayDeque<Integer>();
		
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		
	}

}
