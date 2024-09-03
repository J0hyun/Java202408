package ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayList04 {

	public static void main(String[] args) {
		
		
		//타입 제한 => String
		List<String> list = new ArrayList<>();
//		List<String> list = new LinkedList();
		
		list.add("kor");
		list.add("Eng");
		list.add("math");
		list.add("com");
		
		
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.remove(0);
		
		System.out.println();
		
		
		for(String obj : list) {
			System.out.print(obj + " ");
		}
		
	}

}
