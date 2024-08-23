package ex07;

public class Management {

	public static void main(String[] args) {
		Car car = new Car("123가 4567", "홍길동", "Gasoline", 5);
		car.introduce();
		
		System.out.println("---------------------------------");
		
		Truck truck = new Truck("789나 1011", "이순신", 10.0);
		truck.introduce();
	}

}
