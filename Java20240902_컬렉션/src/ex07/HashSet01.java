package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class HashSet01 {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		
		
		set.add("kor");
		set.add("Eng");
		set.add("math");
		set.add("com");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		
		itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}

}
