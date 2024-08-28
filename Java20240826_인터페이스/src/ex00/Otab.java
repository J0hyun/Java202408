package ex00;

public class Otab extends Mobile {
	Otab() {}
	
	Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	void operate(int time1) {
		setBatterySize(getBatterySize() - time1 * 12);
	}

	@Override
	void charge(int time1) {
		setBatterySize(getBatterySize() + time1 * 8);
	}
	
	
}
