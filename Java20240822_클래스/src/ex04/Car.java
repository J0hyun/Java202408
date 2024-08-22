package ex04;

public class Car {
	static int totalCars;
	
	String name;
	
	Car (String name) {
		this.name = name;
		System.out.println("차량 구입, 이름:" + name);
		totalCars++;
	}
	static void totalCars () {
		System.out.println("구매한 차량 수:" + totalCars);
	}
}
