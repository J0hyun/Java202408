package ex07;

public class Vehicle {
	String licensPlate; // 차량번호
	String owner; 		// 소유자
	
	Vehicle() {}
	
	Vehicle(String licensPlate, String owner) {
		this.licensPlate = licensPlate;
		this.owner = owner;
	}
	
	
	double calculateMaintenanceCost() {
		return 0;
	}
	
	void introduce() {
		System.out.printf("차량 번호 : %s\n", licensPlate);
		System.out.printf("소유자 : %s\n", owner);
		startEngine();
	}
	
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
		
		
	}
}
