package ex03;

import java.util.ArrayList;


public class ArrayList03 {

	public static void main(String[] args) {
		
		
		//타입 제한 => String
		ArrayList<String> list = new ArrayList<>();
		
		list.add("kor");
		list.add("Eng");
		list.add("math");
		list.add("com");
		
		
		
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.remove(0);
		
		System.out.println();
		
		
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		
	}

}
