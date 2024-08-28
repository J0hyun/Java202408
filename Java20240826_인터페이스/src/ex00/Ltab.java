package ex00;

public class Ltab extends Mobile {
	Ltab() {}
	
	Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	void operate(int time1) {
		setBatterySize(getBatterySize() - time1 * 10);
	}

	@Override
	void charge(int time1) {
		setBatterySize(getBatterySize() + time1 * 10);
	}
	
	
	
}
