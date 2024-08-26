package ex08;

public class Item { // 부모클래스
	String name;    // 이름
	int price;      // 가격
	
	public Item() {}
	
	public Item (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return 0;
	}
	
	
	public void print() {
		System.out.println("이름:" + name +", 가격:" + price);
	}
	

}
