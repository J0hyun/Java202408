package ex19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetLab1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		while(true) {
			set.add(random.nextInt(30)+1);
			if(set.size()>=10) break;
		}
		
		for(int n : set) {
			System.out.print(n + " ");
		}
		
	}

}
