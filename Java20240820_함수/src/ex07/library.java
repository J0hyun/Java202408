package ex07;

public class library {

	public static void main(String[] args) {
		LibraryClass c1 = new LibraryClass();
		
		c1.제목 = "이것이자바다";
		c1.저자 = "신용권";
		c1.가격 = 38000;
		c1.재고수량 = 10;
		
		c1.판매(20);
		c1.입고(6);
		c1.총판매금액();
				
		c1.info();
		
	}

}

class LibraryClass{
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
	int 판매누적수량;
	
	void 판매 (int stock ) {
		재고수량 -= stock;
		판매누적수량 += stock;
		System.out.println("판매 : " + stock);
	}
	void 입고 (int stock) {
		재고수량 += stock;
		System.out.println("입고 : " + stock);
	}
	void 총판매금액() {
		System.out.println("총판매금액 : " + 판매누적수량 * 가격);
	}
	
	void info () {
		System.out.printf("제목 : %s, 저자 : %s, 가격 : %d , 재고수량 : %d\n", 제목, 저자, 가격, 재고수량 );
	}
	
	
}