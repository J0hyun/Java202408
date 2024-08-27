package ex08;

public class Otab extends Mobile {
	
	Otab() {}
	
	Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	void operate(int time) {
		int tmp = getBatterySize() - time*12;
		setBatterySize(tmp);
	}
	
	
	void charge(int time) {
		setBatterySize(getBatterySize() + time * 12);
	}
}
