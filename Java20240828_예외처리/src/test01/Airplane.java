package test01;

public class Airplane extends Plane {
	
	Airplane() {}
	
	Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	void flight(int distance) {
		setFuelSize(getFuelSize() - distance * 3 );
	}
 }
