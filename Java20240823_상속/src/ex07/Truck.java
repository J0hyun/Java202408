package ex07;

public class Truck extends Vehicle {
	double loadCapacity;
	
	Truck(String licensPlate, String owner, double loadCapacity) {
		super(licensPlate, owner);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity*20000.0;
	}
	
	void introduce() {
		super.introduce();
		System.out.println("적재 용량 : " + loadCapacity + "톤");
		System.out.println("정비 비용 : " + calculateMaintenanceCost() + "원");
	}
}
