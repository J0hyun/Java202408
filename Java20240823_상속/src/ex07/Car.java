package ex07;

public class Car extends Vehicle {
	String fuelType;
	int seatingCapacity;
	
	
	 Car(String licensPlate, String owner,
			String fuelType, int seatingCapacity) {
		super(licensPlate, owner);  // 차량번호, 소유자
		this.fuelType = fuelType;   // 가솔린 또는 디젤
		this.seatingCapacity = seatingCapacity; // 탑승 인원 
		
	}
	
	//정비비용계산 탑승인원당 1만원
	@Override
	double calculateMaintenanceCost() {
		return seatingCapacity * 10000.0;
	}
	
	void introduce() {
		super.introduce();
		System.out.printf("연료 타입 : %s\n", fuelType);
		System.out.printf("탑승 인원 : %d\n", seatingCapacity);
		System.out.println("정비 비용 :" + calculateMaintenanceCost() + "원");
	}
}
