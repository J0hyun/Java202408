package test01;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	Plane() {}
	
	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	abstract void flight(int distance);
	
	void refuel(int fuel) {
		setFuelSize(getFuelSize()+ fuel * 1);
	}
}
