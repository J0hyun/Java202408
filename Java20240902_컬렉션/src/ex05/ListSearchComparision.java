package ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class ListSearchComparision {

	public static void main(String[] args) {
		
		int size = 10_000_000; 
		int iterations = 1000; // 검색 반복 횟수
		
		
		
		//타입 제한 => String
		List<Integer> arrayList = new ArrayList<>(size);
		List<Integer> linkedList = new LinkedList<>();
		
		Random random = new Random();
		
		
		for (int i = 0; i < size; i++) {
			int value = random.nextInt();
			arrayList.add(value);
			linkedList.add(value);
		}
		
		long startTime = System.nanoTime();
		for (int i = 0; i<iterations; i++) {
			int index = size / 2;
			arrayList.get(index);
		}
		long endTime = System.nanoTime();
		long arrayListDuration = endTime - startTime;

		
		
		startTime = System.nanoTime();
		for(int i = 0; i < iterations; i++) {
			int index = size / 2; //중간 인덱스 검색
			linkedList.get(index);
		}
		
		endTime = System.nanoTime();
		long linkedListDuration = endTime - startTime;
		
		System.out.println("ArrayList 검색 시간: " + arrayListDuration + " ns");
		System.out.println("LinkedList 검색 시간: " + linkedListDuration + " ns");
		
		
	}

}
