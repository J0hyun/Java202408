package ex07;

/*
 * 멤버로컬클래스 생성
 */

interface Printable {
	void print();
}

class Papers{
	
	private String message;
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrinter() { //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
//		
//		 class Printer implements Printable{ //멤버로컬클래스
//			
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//		}
		
//		Printable p = new Printable() { // Printable을 구현한 클래스지만 이름이 없는 것 
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//		};
//		
//		return p;
		 
		
		return new Printable() {
			@Override
			public void print() {
				System.out.println(message);
			}
 		};
	
	}
}



public class AnonymousClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		
		Printable p = papers.getPrinter();
		p.print();
		
	}

}
