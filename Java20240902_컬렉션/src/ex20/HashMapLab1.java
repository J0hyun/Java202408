package ex20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapLab1 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		final int MAX = 5;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("나라이름을 입력하세요 :");
			String str = sc.nextLine();
			
			System.out.println("인구 수를 입력하세요 :");
			int pup = Integer.parseInt(sc.nextLine());
			
			
			if(map.containsKey(str)) {
				System.out.println("나라명 " + map + "는 이미 저장되었습니다.");
			}
			
			map.put(str, pup);
			count++;
			
			if(count >= MAX) break;
		}
		
		
		Set<String> set = map.keySet();
		for(String s : set) {
			System.out.println(s + " " + map.get(s));
		}
		
		
		
		
	}

}
