package ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ArrayList04 {

	public static void main(String[] args) {
		
		
//		List<String> list = new ArrayList<>();
		Set<String> list = new HashSet<String>();
		
		
		list.add("kor");
		list.add("Eng");
		list.add("math");
		list.add("com");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		
		itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}

}
