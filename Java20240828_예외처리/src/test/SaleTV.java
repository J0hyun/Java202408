package test;

public class SaleTV extends TV {
	int price;
	
	SaleTV() {}
	
	SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	void play() {
		System.out.println("판매 TV채널" + getChannel() +"번의 프로를 플레이 합니다.");
	}
	
	public void sale() {
		System.out.println(getModel()+"모델의 상품을 판매합니다. " 
				+ String.format("%,8d",price)+ "을 지불해 주세요.");
		
	}
	
	
	
	
	@Override
	public String toString() {	
		return "판매상품정보 : 모델명("+ getModel()+"), "
				+ "가격("+ String.format("%,d",price) +"원), 크기("+getSize()+")";	
	
	
//	String toString()
	}	
}