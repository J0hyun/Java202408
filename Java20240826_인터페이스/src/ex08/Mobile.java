package ex08;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	Mobile() {}
	
	Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	
	abstract void operate(int time); 

	abstract void charge(int time);
	

	 String getMobileName() {
		return mobileName;
	}

	int getBatterySize() {
		return batterySize;
	}
	
	String getOsType() {
		return osType;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
}
