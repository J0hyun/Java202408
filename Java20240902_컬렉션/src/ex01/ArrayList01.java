package ex01;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}



public class ArrayList01 {

	public static void main(String[] args) {
		
		
		//타입 제한이 없으면 list에는 모든 객체 입력 가능
		ArrayList list = new ArrayList(); // 10개의 방 기본생성  아무 타입이나 상관없음
		
		list.add(10);
		list.add(new Integer(20));
		list.add("kor");
		list.add(new A());
		
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		
	}

}
