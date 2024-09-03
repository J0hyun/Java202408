package ex02;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}



public class ArrayList02 {

	public static void main(String[] args) {
		
		
		//타입 제한 => String
		ArrayList<String> list = new ArrayList<>();
		
//		list.add(10);
//		list.add(new Integer(20));
		list.add("kor");
//		list.add(new A());
		list.add("Eng");
		list.add("math");
		list.add("com");
		
		
		
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		
	}

}
