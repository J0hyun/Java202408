package ex07;

public class libraryTest {

	public static void main(String[] args) {
	 BookStore b1 = new BookStore();
	 b1.title = "이것이 자바다";
	 b1.name = "신용권";
	 b1.price = 38000;        //가격
	 b1.stock = 50;           //재고수량
	 
	
	
	 b1.sale(30);             //판매
	 b1.warehousing(0);      //입고
	 b1.allSale();
	 
	 b1.info();
	 
	
	}

}

class BookStore {
	String title; // 제목
	String name;  // 저자
	int price;    // 가격
	int stock;    // 재고수량
 	int cumulative; // 판매누적수량
	

	void sale(int s) {
		 stock -= s;      // 판매(sale) : 재고수량(stock) - int s  
		 cumulative += s; // 판매누적수량(cumulative) = 판매누적수량(cumulatvie) + int s
		 System.out.println("판매 : " + s );
		 } //판매

	void warehousing(int d) {
		stock += d;             //  입고(warehousing) : 재고수량(stock) + int d
		System.out.println("입고 : " + d);
	} // 입고
	
	void allSale() {
		System.out.println("총 판매 금액 : " + price * cumulative);  // 총 판매 금액 : 가격*누적판매량
	}//총판매
	
	void info() {
		System.out.printf("제목 : %s, 저자 %s, 가격 : %d, 재고수량 : %d\n", title, name, price, stock);
	}
	
}