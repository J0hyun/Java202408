package ex04;

public class Car2 {
	
	String model;
	static int count;
	
	Car2() {}
	Car2(String model) {
		this.model = model;
		++count;
	}
	
	void infoCar() {
		System.out.println("차량 구입, 이름: " + this.model);
	}
	
	
	static void showTotalCars() {
		System.out.println("구매한 차량 수 : " + count);
	}

}
