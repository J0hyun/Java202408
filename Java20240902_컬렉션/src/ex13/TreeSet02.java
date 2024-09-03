package ex13;

import java.util.*;

class Person implements Comparable<Person> {
	private int age;
	public Person(int age) {this.age = age;}
	public String toString() {
		return String.valueOf(age); // age + "";
	}
	@Override
	public int compareTo(Person o) {
		if(this.age == o.age) {
			return 0;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return -1;
		}
		
//		return this.age - o.age;
	}
		
}


public class TreeSet02 {

	public static void main(String[] args) {
		
		//TreeSet ==> 자동 정렬 (오름차순)
		Set<Person> set = new TreeSet<>();
		
		// ASCII          A=65,  a=97
		set.add(new Person(10));
		set.add(new Person(20));
		set.add(new Person(30));
		set.add(new Person(22));
		set.add(new Person(35));
		set.add(new Person(10));
		
		Iterator<Person> itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		
		
		
	}

}
