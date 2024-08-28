package test01;

public class Cargoplane extends Plane {
	
	Cargoplane() {}
	
	Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	void flight(int distance) {
		setFuelSize(getFuelSize() - distance * 5 );
	}
}
