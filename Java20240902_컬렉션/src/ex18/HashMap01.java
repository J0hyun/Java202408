package ex18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		
		// key : 중복X, value : 중복OK
		// >>> 순차 출력(반복문, interator로 출력)
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "Lee");
		map.put(4, "cho");
		map.put(3, "sujin");
		map.put(1, "park");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println("--------------");

		Set<Integer> set  = map.keySet(); // key값만 리스트에 저장
		
		for(Integer n : set) {
			System.out.println(map.get(n));
		}
		System.out.println("-----------------");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()) );
		}
		
		
	}
}