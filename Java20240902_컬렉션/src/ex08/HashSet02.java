package ex08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class HashSet02 {

	public static void main(String[] args) {
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		Iterator<Integer> itr = set.iterator();
		
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
